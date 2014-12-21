/**
 * 
 */
package pattern.TemplateMethod;

/**
 * ����ģ��(Concrete Template)��ɫ
 * <p>
 * 1��ʵ�ָ����������һ���������󷽷���������һ�������߼�����ɲ��衣
 * 2��ÿһ������ģ���ɫ������������������ģ���ɫ��֮��Ӧ����ÿһ������ģ���ɫ�����Ը�����Щ���󷽷�
 * (Ҳ���Ƕ����߼�����ɲ���)�Ĳ�ͬʵ�֣��Ӷ�ʹ�ö����߼���ʵ�ָ�����ͬ��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-5-7
 */
public class ConcreteClass1 extends AbstractClass {
	
	/**
	 * ʵ�ֳ���ģ���ɫ�л�������(�������)
	 *
	 * @see pattern.TemplateMethod.AbstractClass#operationStepMiddle1()
	 */
	protected void operationStepMiddle1(){
		System.out.println("ConcreteClass1.operationStepMiddle1()");
	}
	
	/**
	 * ʵ�ֳ���ģ���ɫ�л�������(�������)
	 *
	 * @see pattern.TemplateMethod.AbstractClass#operationStepMiddle2()
	 */
	protected void operationStepMiddle2(){
		System.out.println("ConcreteClass1.operationStepMiddle2()");
	}
}