/**
 * 
 */
package pattern.Singleton.demo;

/**
 * 序列键生成器演示2
 * <p>
 * 这个方案是方案1的修正，这个单例类有了数据库功能
 * 它将键值存储在数据库的表中，每次客户端请求时，
 * 首先将这个表中的值增加1，然后将这个值返还给客户端。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-3-14
 */
public class KeyGeneratorDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println(KeyGenerator.getInstance().getNextKey());
		}
	}

	static class KeyGenerator {

		// 单例对象
		private static KeyGenerator keygen = new KeyGenerator();

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
		 * 生成下一个合适的键值
		 */
		public synchronized int getNextKey() {
			return getNextKeyFromDB();
		}

		private int getNextKeyFromDB() {
			// 下面这些都是对数据库的SQL操作：
			// 将存储序列键起始值的表中的起始值+1，然后返回这个新值
			return 1000;// 仅仅是示例
		}
	}
}
