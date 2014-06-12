/**
 * 
 */
package pattern.TemplateMethod;

/**
 * ����ģ��(Concrete Template)��ɫ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-5-7
 */
public class ConcreteClass2 extends AbstractClass {
	
	/**
	 * ʵ�ֳ���ģ���ɫ�л�������(�������)
	 *
	 * @see pattern.TemplateMethod.AbstractClass#operationStepMiddle1()
	 */
	protected void operationStepMiddle1(){
		System.out.println("ConcreteClass2.operationStepMiddle1()");
	}
	
	/**
	 * ʵ�ֳ���ģ���ɫ�л�������(�������)
	 *
	 * @see pattern.TemplateMethod.AbstractClass#operationStepMiddle2()
	 */
	protected void operationStepMiddle2(){
		System.out.println("ConcreteClass2.operationStepMiddle2()");
	}
}