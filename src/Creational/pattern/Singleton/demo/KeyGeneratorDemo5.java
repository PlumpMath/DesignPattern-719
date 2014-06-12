/**
 * 
 */
package pattern.Singleton.demo;

import java.util.HashMap;
import java.util.Map;

/**
 * 序列键生成器演示5
 * <p>
 * 为了能够处理多产品(表)键值的情况，除了可以将单例模式所封装的
 * 单一状态改为聚集状态之外，还可以采用多例模式
 * <p>
 * 第四个和第五个方案都是具有实用价值的设计方案
 * 如果一个单例模式是一个聚集对象的话，那么这个聚集中保存的是对其他对象的引用
 * 一个多例模式则不同，多例对象使用一个聚集对象登记和保存自身的实例
 * 由于这两种设计模式的相似之处，在很多情况下它们可以互换使用
 * 第四个和第五个方案就是建立在单例聚集对象和多例对象的基础上的实现了相同功能的两种不同设计
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-3-14
 */
public class KeyGeneratorDemo5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 0; i < 21; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(KeyGenerator.getInstance("table" + j).getNextKey());
			}
		}
	}

	static class KeyGenerator {

		/** 缓存池容量，即一次查询预定的键值数目 */
		private static final int POOL_SIZE = 20;
		// 不同的产品使用不同的KeyGenerator，使用Map进行登记
		private static Map<String, KeyGenerator> keygenMap = new HashMap<String, KeyGenerator>();

		private KeyInfo keyInfo;

		private KeyGenerator(String keyName) {
			this.keyInfo = new KeyInfo(keyName, POOL_SIZE);
		}

		/**
		 * 静态工厂方法，返回自己的惟一实例
		 */
		public static KeyGenerator getInstance(String keyName) {
			KeyGenerator keygen;
			if (keygenMap.get(keyName) == null) {
				keygen = new KeyGenerator(keyName);
				keygenMap.put(keyName, keygen);
				System.out.println("new KeyGenerator created for " + keyName);
			} else {
				keygen = keygenMap.get(keyName);
				System.out.println("KeyGenerator for " + keyName + " found.");
			}
			return keygen;
		}

		/**
		 * 为指定产品(表)生成下一个合适的键值
		 */
		public synchronized int getNextKey() {
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