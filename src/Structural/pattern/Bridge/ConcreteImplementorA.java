/**
 * 
 */
package pattern.Bridge;

/**
 * ����ʵ�ֻ���ɫ
 * <p>
 * �����ɫ����ʵ�ֻ���ɫ�ӿڵľ���ʵ�֡�
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-26
 */
public class ConcreteImplementorA implements Implementor {

	@Override
	public void operationImpl() {
		System.out.println("ConcreteImplementorA.operationImpl()");
	}
}