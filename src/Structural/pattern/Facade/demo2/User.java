/**
 * 
 */
package pattern.Facade.demo2;

/**
 * �û���
 * <p>
 * �ͻ��˽�ɫ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-25
 */
public class User {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// �ͻ���ֱ��ʹ��Facade�࣬�����˺�CPU��ֱ�Ӵ򽻵�
		Computer computer = new Computer();
		computer.start();
	}
}