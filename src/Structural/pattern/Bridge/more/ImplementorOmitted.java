/**
 * 
 */
package pattern.Bridge.more;

/**
 * 抽象实现化角色的省略
 * <p>
 * 在只有一个具体实现化角色的情况下，抽象实现化角色就没有什么意义
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-27
 */
public class ImplementorOmitted {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ConcreteImplementor implementor = new ConcreteImplementor();
		Abstraction abs = new RefinedAbstraction(implementor);
		abs.operation();
		// 可以有几个抽象化角色类合用相同的具体实现化角色类
		// 既然抽象和实现已经分离，那么就可以出现不同的抽象化这种共享相同实现的情况。
		abs = new RefinedAbstraction(implementor);
		abs.operation();
		// 抽象化角色可以随时更换具体实现化角色类的实例
		abs.setImplementor(new ConcreteImplementor());
		abs.operation();
	}

	static abstract class Abstraction {
		
		// 直接关联具体实现化角色
		private ConcreteImplementor implementor;

		public Abstraction(ConcreteImplementor implementor) {
			this.implementor = implementor;
		}

		public void setImplementor(ConcreteImplementor implementor) {
			this.implementor = implementor;
		}

		private ConcreteImplementor getImplementor() {
			return implementor;
		}

		/**
		 * 某个业务方法
		 */
		public void operation() {
			// 直接委派给实现化对象
			getImplementor().operationImpl();
		}
	}

	static class RefinedAbstraction extends Abstraction {

		public RefinedAbstraction(ConcreteImplementor implementor) {
			super(implementor);
		}

		/**
		 * 改变了这个业务方法的定义
		 */
		public void operation() {
			System.out.println("RefinedAbstraction.operation()");
			super.operation();
		}
	}

	static class ConcreteImplementor {

		public void operationImpl() {
			System.out.println("ConcreteImplementor.operationImpl()");
		}
	}
}