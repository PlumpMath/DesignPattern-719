/**
 * 
 */
package pattern.State;

/**
 * �ͻ�����
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-5-24
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Context context = new Context();
		context.setState(new ConcreteStateA(context));
		context.operation();
		context.operation();
		context.operation();
		context.operation();
	}
}