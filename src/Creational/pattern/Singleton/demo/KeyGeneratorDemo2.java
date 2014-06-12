/**
 * 
 */
package pattern.Singleton.demo;

/**
 * ���м���������ʾ2
 * <p>
 * ��������Ƿ���1������������������������ݿ⹦��
 * ������ֵ�洢�����ݿ�ı��У�ÿ�οͻ�������ʱ��
 * ���Ƚ�������е�ֵ����1��Ȼ�����ֵ�������ͻ��ˡ�
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-3-14
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

		// ��������
		private static KeyGenerator keygen = new KeyGenerator();

		private KeyGenerator() {
			// do nothing
		}
		
		/**
		 * ��̬���������������Լ���Ωһʵ��
		 */
		public static KeyGenerator getInstance() {
			return keygen;
		}

		/**
		 * ������һ�����ʵļ�ֵ
		 */
		public synchronized int getNextKey() {
			return getNextKeyFromDB();
		}

		private int getNextKeyFromDB() {
			// ������Щ���Ƕ����ݿ��SQL������
			// ���洢���м���ʼֵ�ı��е���ʼֵ+1��Ȼ�󷵻������ֵ
			return 1000;// ������ʾ��
		}
	}
}