/**
 * 
 */
package pattern.ChainOfResponsibility;

/**
 * �ͻ��˽�ɫ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-1
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * �ͻ��˴��������������߶���
		 * ��ָ����һ�������߶�����¼��ǵڶ��������߶��� 
		 * ���ڶ��������߶���û���¼ң�
		 * Ȼ��ͻ��˽����󴫵ݸ���һ�����������
		 */
		Handler handler1 = new ConcreteHandlerA();
		Handler handler2 = new ConcreteHandlerB();
		handler1.setNext(handler2);
		handler1.handleRequest();
	}
}