/**
 * 
 */
package pattern.Bridge;

/**
 * �ͻ�����
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-26
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Abstraction abs = new RefinedAbstraction(new ConcreteImplementorA());
		abs.operation();
		// ͨ����ͬ��ʵ�ֻ�����ί�ɣ����ﵽ��̬��ת���Լ��Ĺ��ܵ�Ŀ��
		abs.setImplementor(new ConcreteImplementorB());
		abs.operation();
	}
}