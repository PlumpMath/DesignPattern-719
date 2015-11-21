/**
 * 
 */
package pattern.Singleton.demo;

/**
 * 序列键生成器演示3
 * <p>
 * 实际上客户端调用getNextKey()方法每一次都进行键值的查询时不必要的
 * 毕竟一个键值只是一些序列号码，与其每接到一次请求就查询一次然后向客户端提供这一个值
 * 不如在一次查询中一次性的预先登记多个键值，然后连续多次的向客户端提供这些预定的键值
 * 这样就节省了大部分不必要的数据库查询操作，这就是键值的缓存机制。
 * 当KeyGenerator每次更新数据库中的键值时，它都将键值增加，与方案2不同的是：
 * 键值的增加值不是1而是更多，本例中是20，即一次性预定20个键值。
 * <p>
 * 一般的系统都不会只有一个产品(表)的键值，而是有多个产品(表)的键值需要生成
 * (即不同产品(表)的键值可以相同)，这里有两个方案可以达到这个目的，详见：
 * KeyGeneratorDemo4 和 KeyGeneratorDemo5
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-3-14
 */
public class KeyGeneratorDemo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 0; i < 21; i++) {
			System.out.println(KeyGenerator.getInstance().getNextKey());
		}
	}

	static class KeyGenerator {

		/** 缓存池容量，即一次查询预定的键值数目 */
		private static final int POOL_SIZE = 20;
		// 单例对象
		private static KeyGenerator keygen = new KeyGenerator();

		private KeyInfo keyInfo;
		
		private KeyGenerator() {
			this.keyInfo = new KeyInfo(POOL_SIZE);
		}
		
		/**
		 * 静态工厂方法，返回自己的惟一实例
		 */
		public static KeyGenerator getInstance() {
			return keygen;
		}

		/**
		 * 生成下一个合适的键值
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

		public KeyInfo(int poolSize) {
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
		 * 去数据库进行查询，初始化键值的起始值和最大值
		 */
		private void retrieveFromDB() {
			// 下面这些都是对数据库的SQL操作：
			// 将存储序列键起始值的表中的起始值+poolSize，然后返回原来的起始值
			this.nextKey = 1000;
			this.keyMax = 1000 + poolSize;
		}

		public int getKeyMax() {
			return keyMax;
		}
	}
}
