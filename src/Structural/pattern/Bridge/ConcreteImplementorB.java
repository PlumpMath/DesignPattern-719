/**
 * 
 */
package pattern.Bridge;

/**
 * ����ʵ�ֻ���ɫ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-26
 */
public class ConcreteImplementorB implements Implementor {

	@Override
	public void operationImpl() {
		System.out.println("ConcreteImplementorB.operationImpl()");
	}
}