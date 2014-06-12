/**
 * 
 */
package pattern.Singleton.demo;

/**
 * ���м���������ʾ3
 * <p>
 * ʵ���Ͽͻ��˵���getNextKey()����ÿһ�ζ����м�ֵ�Ĳ�ѯʱ����Ҫ��
 * �Ͼ�һ����ֵֻ��һЩ���к��룬����ÿ�ӵ�һ������Ͳ�ѯһ��Ȼ����ͻ����ṩ��һ��ֵ
 * ������һ�β�ѯ��һ���Ե�Ԥ�ȵǼǶ����ֵ��Ȼ��������ε���ͻ����ṩ��ЩԤ���ļ�ֵ
 * �����ͽ�ʡ�˴󲿷ֲ���Ҫ�����ݿ��ѯ����������Ǽ�ֵ�Ļ�����ơ�
 * ��KeyGeneratorÿ�θ������ݿ��еļ�ֵʱ����������ֵ���ӣ��뷽��2��ͬ���ǣ�
 * ��ֵ������ֵ����1���Ǹ��࣬��������20����һ����Ԥ��20����ֵ��
 * <p>
 * һ���ϵͳ������ֻ��һ����Ʒ(��)�ļ�ֵ�������ж����Ʒ(��)�ļ�ֵ��Ҫ����
 * (����ͬ��Ʒ(��)�ļ�ֵ������ͬ)�������������������Դﵽ���Ŀ�ģ������
 * KeyGeneratorDemo4 �� KeyGeneratorDemo5
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-3-14
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

		/** �������������һ�β�ѯԤ���ļ�ֵ��Ŀ */
		private static final int POOL_SIZE = 20;
		// ��������
		private static KeyGenerator keygen = new KeyGenerator();

		private KeyInfo keyInfo;
		
		private KeyGenerator() {
			this.keyInfo = new KeyInfo(POOL_SIZE);
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
			return keyInfo.getNextKey();
		}
	}
	
	/**
	 * ������ṩ�������ݿ��ѯ�Ĺ��ܣ����Ҵ洢һ����Ŀ�ļ�ֵ
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
		 * ȥ���ݿ���в�ѯ����ʼ����ֵ����ʼֵ�����ֵ
		 */
		private void retrieveFromDB() {
			// ������Щ���Ƕ����ݿ��SQL������
			// ���洢���м���ʼֵ�ı��е���ʼֵ+poolSize��Ȼ�󷵻�ԭ������ʼֵ
			this.nextKey = 1000;
			this.keyMax = 1000 + poolSize;
		}

		public int getKeyMax() {
			return keyMax;
		}
	}
}