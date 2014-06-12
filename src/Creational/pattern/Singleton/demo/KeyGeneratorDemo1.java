/**
 * 
 */
package pattern.Singleton.demo;

/**
 * ���м���������ʾ1
 * <p>
 * ������򵥵���������ӳ���ĽǶȳ�����û�����ݿⱳ��
 * ��������ƻ�����ʵ������ͻ����ṩ��ֵ�Ĺ��ܣ�����Ҳ�����Ե�ȱ�㣺
 * ����û�����ݿ�Ĵ洢��һ��ϵͳ����������
 * KeyGenerator���󶼻����³�ʼ�����ͻ���ɼ�ֵ���ظ���
 * <p>
 * Ϊ�˱��������ᵽ��ȱ�㣬�ͱ��뽫ÿ�εļ�ֵ�洢������
 * �Ա�һ��ϵͳ�жϺ�����ʱ�����Խ������ֵȡ����Ϊ�µ���ʼֵ��
 * �����ͱ������½�����ƣ�Դ��� KeyGeneratorDemo2
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-3-14
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

		// ��������
		private static KeyGenerator keygen = new KeyGenerator();
		// ���м���ʼֵ
		private int starts = 1000;

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
			return starts++;
		}
	}
}