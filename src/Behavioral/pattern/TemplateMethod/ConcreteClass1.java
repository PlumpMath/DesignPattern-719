/**
 * 
 */
package pattern.TemplateMethod;

/**
 * 具体模板(Concrete Template)角色
 * <p>
 * 1，实现父类所定义的一个或多个抽象方法，它们是一个顶级逻辑的组成步骤。
 * 2，每一个抽象模板角色都可以有任意多个具体模板角色与之对应，而每一个具体模板角色都可以给出这些抽象方法
 * (也就是顶级逻辑的组成步骤)的不同实现，从而使得顶级逻辑的实现各不相同。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-5-7
 */
public class ConcreteClass1 extends AbstractClass {
	
	/**
	 * 实现抽象模板角色中基本方法(抽象操作)
	 *
	 * @see pattern.TemplateMethod.AbstractClass#operationStepMiddle1()
	 */
	protected void operationStepMiddle1(){
		System.out.println("ConcreteClass1.operationStepMiddle1()");
	}
	
	/**
	 * 实现抽象模板角色中基本方法(抽象操作)
	 *
	 * @see pattern.TemplateMethod.AbstractClass#operationStepMiddle2()
	 */
	protected void operationStepMiddle2(){
		System.out.println("ConcreteClass1.operationStepMiddle2()");
	}
}