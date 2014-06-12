/**
 * 
 */
package pattern.Singleton.demo;

import java.util.HashMap;
import java.util.Map;

/**
 * ���м���������ʾ5
 * <p>
 * Ϊ���ܹ�������Ʒ(��)��ֵ����������˿��Խ�����ģʽ����װ��
 * ��һ״̬��Ϊ�ۼ�״̬֮�⣬�����Բ��ö���ģʽ
 * <p>
 * ���ĸ��͵�����������Ǿ���ʵ�ü�ֵ����Ʒ���
 * ���һ������ģʽ��һ���ۼ�����Ļ�����ô����ۼ��б�����Ƕ��������������
 * һ������ģʽ��ͬ����������ʹ��һ���ۼ�����ǼǺͱ��������ʵ��
 * �������������ģʽ������֮�����ںܶ���������ǿ��Ի���ʹ��
 * ���ĸ��͵�����������ǽ����ڵ����ۼ�����Ͷ�������Ļ����ϵ�ʵ������ͬ���ܵ����ֲ�ͬ���
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-3-14
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

		/** �������������һ�β�ѯԤ���ļ�ֵ��Ŀ */
		private static final int POOL_SIZE = 20;
		// ��ͬ�Ĳ�Ʒʹ�ò�ͬ��KeyGenerator��ʹ��Map���еǼ�
		private static Map<String, KeyGenerator> keygenMap = new HashMap<String, KeyGenerator>();

		private KeyInfo keyInfo;

		private KeyGenerator(String keyName) {
			this.keyInfo = new KeyInfo(keyName, POOL_SIZE);
		}

		/**
		 * ��̬���������������Լ���Ωһʵ��
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
		 * Ϊָ����Ʒ(��)������һ�����ʵļ�ֵ
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
		
		private String keyName;// ��Ʒ��

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
		 * ȥ���ݿ���в�ѯ����ʼ��ָ����Ʒ(��)��ֵ����ʼֵ�����ֵ
		 */
		private void retrieveFromDB() {
			// ������Щ���Ƕ����ݿ��SQL������
			// ���洢���м���ʼֵ�ı��е���ʼֵ+poolSize��Ȼ�󷵻�ԭ������ʼֵ
			this.nextKey = 1000;
			this.keyMax = 1000 + poolSize;
			System.out.println("retrieve from " + keyName);
		}

		public int getKeyMax() {
			return keyMax;
		}
	}
}