/**
 * 
 */
package pattern.TemplateMethod;

/**
 * 抽象模板(Abstract Template)角色
 * <p>
 * 1，定义了一个或多个抽象操作，以便让子类实现。
 * 这些抽象操作叫做基本操作，它们是一个顶级逻辑的组成步骤。
 * 2，定义并实现了一个模板方法。
 * 这个模板方法一般是一个具体方法，它给出了一个顶级逻辑的骨架，而逻辑的组成步骤在相应的抽象操作中，推迟到子类实现。
 * 顶级逻辑也有可能调用一些具体方法。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-5-7
 */
public abstract class AbstractClass {

	/**
	 * 这是一个模板方法，定义了一个顶级逻辑的骨架。
	 */
	public final void operation() {
		operationStepFirst();
		// 逻辑的组成步骤在相应的抽象操作中，推迟到子类实现。
		operationStepMiddle1();
		operationStepMiddle2();
		// 顶级逻辑也有可能调用一些具体方法。
		operationStepLast();
	}

	/**
	 * 私有具体方法
	 */
	private void operationStepFirst() {
		System.out.println("AbstractClass.operationStepFirst()");
	}

	/**
	 * 这是一个基本方法(抽象操作)，由子类实现，它是一个顶级逻辑的组成步骤。
	 */
	protected abstract void operationStepMiddle1();

	/**
	 * 这是一个基本方法(抽象操作)，由子类实现，它是一个顶级逻辑的组成步骤。
	 */
	protected abstract void operationStepMiddle2();

	/**
	 * 私有具体方法
	 */
	private void operationStepLast() {
		System.out.println("AbstractClass.operationStepLast()");
	}
}
