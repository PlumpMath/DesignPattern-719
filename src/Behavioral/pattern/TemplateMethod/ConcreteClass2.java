/**
 * 
 */
package pattern.TemplateMethod;

/**
 * 具体模板(Concrete Template)角色
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-5-7
 */
public class ConcreteClass2 extends AbstractClass {
	
	/**
	 * 实现抽象模板角色中基本方法(抽象操作)
	 *
	 * @see pattern.TemplateMethod.AbstractClass#operationStepMiddle1()
	 */
	protected void operationStepMiddle1(){
		System.out.println("ConcreteClass2.operationStepMiddle1()");
	}
	
	/**
	 * 实现抽象模板角色中基本方法(抽象操作)
	 *
	 * @see pattern.TemplateMethod.AbstractClass#operationStepMiddle2()
	 */
	protected void operationStepMiddle2(){
		System.out.println("ConcreteClass2.operationStepMiddle2()");
	}
}