/**
 * 
 */
package pattern.Decorator;

/**
 * �ͻ�����
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-13
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * װ��ģʽ�Կͻ��˵�͸����Ҫ�����Ҫ����һ��ConcreteDecorator
		 * ���͵ı���������Ӧ������һ��Component���͵ı�����
		 * �����װ��ģʽ�Կͻ�������ȫ͸���ĺ��塣������ʾ��
		 */
		Component component = new ConcreteComponent();
		component.operation();
		Component decorator = new ConcreteDecorator(component);
		decorator.operation();
		Component decorator2 = new ConcreteDecorator(decorator);
		decorator2.operation();
		// ���͵Ĵ�������������ʾ��
		new ConcreteDecorator(new ConcreteDecorator(new ConcreteComponent()));
		// ÿһ��������ṩ��һЩ�µĹ���
	}
}