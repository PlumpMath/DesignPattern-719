/**
 * 
 */
package pattern.Strategy;

/**
 * �ͻ���
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-30
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// �ɿͻ��˸����Լ���Ҫ����ʹ���ĸ�����
		Context context = new Context();
		context.contextOperation();
		// �滻Ĭ�ϲ���
		context.setStrategy(new ConcreteStrategyA());
		context.contextOperation();
		// ʹ����һ������
		context.setStrategy(new ConcreteStrategyB());
		context.contextOperation();
	}
}