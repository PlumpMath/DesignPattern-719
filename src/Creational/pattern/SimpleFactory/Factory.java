/**
 * 
 */
package pattern.SimpleFactory;

/**
 * ������
 * <p>
 * ���������ɫ���ǹ�������ģʽ�ĺ��ģ�������Ӧ�ý�����ص���ҵ�߼���
 * �������ڿͻ��˵�ֱ�ӵ����´�����Ʒ������������һ������Java��ʵ�֡�
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-2-3
 */
public class Factory {

	/**
	 * ����һ���µľ����Ʒ��ʵ����������������
	 * <p>
	 * �����������һ�㶼�Ǿ�̬�ģ���ȻҲ���Բ��ǡ�
	 */
	public static Product create() {
		return new ConcreteProduct();
	}
}