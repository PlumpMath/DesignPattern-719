/**
 * 
 */
package pattern.Bridge;

/**
 * �������󻯽�ɫ
 * <p>
 * ��չ���󻯽�ɫ���ı����������Գ��󻯵Ķ��塣
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-26
 */
public class RefinedAbstraction extends Abstraction {

	public RefinedAbstraction(Implementor implementor) {
		super(implementor);
	}

	/**
	 * �ı�(����)�����ҵ�񷽷��Ķ���
	 * <p>
	 * �ںܶ�����£��������󻯽�ɫû��"����"���󻯽�ɫ����Ϊ����������ġ�
	 */
	public void operation() {
		System.out.println("RefinedAbstraction.operation()");
		super.operation();
	}
}