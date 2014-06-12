/**
 * 
 */
package pattern.Flyweight.composite;

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
		Flyweight com = factory.create(new Character[] { 'a', 'b', 'a' });
		// �Բ�����ʽ����һ������״̬
		com.operation("composite");
		factory.printAllFlyweights();
	}
}