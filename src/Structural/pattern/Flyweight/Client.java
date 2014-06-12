/**
 * 
 */
package pattern.Flyweight;

/**
 * �ͻ���(Client)��ɫ
 * <p>
 * ����ɫ��Ҫά��һ����������Ԫ��������á�����ɫ��Ҫ���д洢������Ԫ���������״̬��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-8-2
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// �ͻ���ֻ��ʹ����Ԫ����������Ԫ����
		FlyweightFactory factory = FlyweightFactory.getInstance();
		Flyweight f1 = factory.create('a');
		// �Բ�����ʽ����һ������״̬
		f1.operation("1st");
		Flyweight f2 = factory.create('b');
		f2.operation("2nd");
		Flyweight f3 = factory.create('a');
		f3.operation("3rd");
		factory.printAllFlyweights();
	}
}