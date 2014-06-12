/**
 * 
 */
package pattern.Singleton.demo;

import java.util.HashMap;
import java.util.Map;

/**
 * ���м���������ʾ4
 * <p>
 * ��ȻKeyGenerator�ǵ����࣬������Ȼ�������ڲ�ʹ��һ���ۼ���������Ʒ(��)�ļ�ֵ
 * Ҳ���ǿ���ʹ��һ�������ǵ�������ľۼ��������Ϻ��ʵĽӿڴﵽĿ��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-3-14
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

		/** �������������һ�β�ѯԤ���ļ�ֵ��Ŀ */
		private static final int POOL_SIZE = 20;
		// ��������
		private static KeyGenerator keygen = new KeyGenerator();
		// ��ͬ�Ĳ�Ʒʹ�ò�ͬ��KeyInfo��ʹ��Map���еǼ�
		private Map<String,KeyInfo> keyInfoMap = new HashMap<String,KeyInfo>();
		
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
		 * Ϊָ����Ʒ(��)������һ�����ʵļ�ֵ
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