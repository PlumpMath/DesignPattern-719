/**
 * 
 */
package pattern.Singleton.demo;

/**
 * 序列键生成器演示1
 * <p>
 * 这是最简单的情况，但从程序的角度出发，没有数据库背景
 * 本例的设计基本上实现了向客户端提供键值的功能，但是也有明显的缺点：
 * 由于没有数据库的存储，一旦系统重新启动，
 * KeyGenerator对象都会重新初始化，就会造成键值的重复。
 * <p>
 * 为了避免上面提到的缺点，就必须将每次的键值存储起来，
 * 以便一旦系统中断和重启时，可以将这个键值取出作为新的起始值。
 * 这样就必须重新进行设计，源码见 KeyGeneratorDemo2
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-3-14
 */
public class KeyGeneratorDemo1 {

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
		// 序列键起始值
		private int starts = 1000;

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
			return starts++;
		}
	}
}
