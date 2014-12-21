/**
 * 
 */
package pattern.TemplateMethod;

/**
 * ����ģ��(Abstract Template)��ɫ
 * <p>
 * 1��������һ����������������Ա�������ʵ�֡�
 * ��Щ���������������������������һ�������߼�����ɲ��衣
 * 2�����岢ʵ����һ��ģ�巽����
 * ���ģ�巽��һ����һ�����巽������������һ�������߼��ĹǼܣ����߼�����ɲ�������Ӧ�ĳ�������У��Ƴٵ�����ʵ�֡�
 * �����߼�Ҳ�п��ܵ���һЩ���巽����
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-5-7
 */
public abstract class AbstractClass {

	/**
	 * ����һ��ģ�巽����������һ�������߼��ĹǼܡ�
	 */
	public final void operation() {
		operationStepFirst();
		// �߼�����ɲ�������Ӧ�ĳ�������У��Ƴٵ�����ʵ�֡�
		operationStepMiddle1();
		operationStepMiddle2();
		// �����߼�Ҳ�п��ܵ���һЩ���巽����
		operationStepLast();
	}

	/**
	 * ˽�о��巽��
	 */
	private void operationStepFirst() {
		System.out.println("AbstractClass.operationStepFirst()");
	}

	/**
	 * ����һ����������(�������)��������ʵ�֣�����һ�������߼�����ɲ��衣
	 */
	protected abstract void operationStepMiddle1();

	/**
	 * ����һ����������(�������)��������ʵ�֣�����һ�������߼�����ɲ��衣
	 */
	protected abstract void operationStepMiddle2();

	/**
	 * ˽�о��巽��
	 */
	private void operationStepLast() {
		System.out.println("AbstractClass.operationStepLast()");
	}
}