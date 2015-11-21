/**
 * 
 */
package pattern.Singleton.demo;

import java.util.HashMap;
import java.util.Map;

/**
 * 序列键生成器演示4
 * <p>
 * 虽然KeyGenerator是单例类，但是仍然可以在内部使用一个聚集管理多个产品(表)的键值
 * 也就是可以使用一个本身是单例对象的聚集对象配上合适的接口达到目的
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-3-14
 */
public class KeyGeneratorDemo4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 0; i < 21; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(KeyGenerator.getInstance().getNextKey("table" + j));
			}
		}
	}

	static class KeyGenerator {

		/** 缓存池容量，即一次查询预定的键值数目 */
		private static final int POOL_SIZE = 20;
		// 单例对象
		private static KeyGenerator keygen = new KeyGenerator();
		// 不同的产品使用不同的KeyInfo，使用Map进行登记
		private Map<String,KeyInfo> keyInfoMap = new HashMap<String,KeyInfo>();
		
		private KeyGenerator() {
			// do nothing
		}
		
		/**
		 * 静态工厂方法，返回自己的惟一实例
		 */
		public static KeyGenerator getInstance() {
			return keygen;
		}

		/**
		 * 为指定产品(表)生成下一个合适的键值
		 */
		public synchronized int getNextKey(String keyName) {
			KeyInfo keyInfo;
			if(keyInfoMap.get(keyName) == null){
				keyInfo = new KeyInfo(keyName ,POOL_SIZE);
				keyInfoMap.put(keyName, keyInfo);
				System.out.println("new key created.");
			}else {
				keyInfo = keyInfoMap.get(keyName);
				System.out.println("key found.");
			}
			return keyInfo.getNextKey();
		}
	}
	
	/**
	 * 这个类提供了向数据库查询的功能，并且存储一定数目的键值
	 */
	static class KeyInfo {

		private int keyMax;
		private int nextKey;
		private int poolSize;
		
		private String keyName;// 产品名

		public KeyInfo(String keyName ,int poolSize) {
			this.keyName = keyName;
			this.poolSize = poolSize;
			retrieveFromDB();
		}

		public int getNextKey() {
			if (nextKey >= keyMax) {
				retrieveFromDB();
			}
			return nextKey++;
		}

		/**
		 * 去数据库进行查询，初始化指定产品(表)键值的起始值和最大值
		 */
		private void retrieveFromDB() {
			// 下面这些都是对数据库的SQL操作：
			// 将存储序列键起始值的表中的起始值+poolSize，然后返回原来的起始值
			this.nextKey = 1000;
			this.keyMax = 1000 + poolSize;
			System.out.println("retrieve from " + keyName);
		}

		public int getKeyMax() {
			return keyMax;
		}
	}
}
