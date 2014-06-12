/**
 * 
 */
package pattern.Bridge.more;

/**
 * ����ʵ�ֻ���ɫ��ʡ��
 * <p>
 * ��ֻ��һ������ʵ�ֻ���ɫ������£�����ʵ�ֻ���ɫ��û��ʲô����
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-27
 */
public class ImplementorOmitted {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ConcreteImplementor implementor = new ConcreteImplementor();
		Abstraction abs = new RefinedAbstraction(implementor);
		abs.operation();
		// �����м������󻯽�ɫ�������ͬ�ľ���ʵ�ֻ���ɫ��
		// ��Ȼ�����ʵ���Ѿ����룬��ô�Ϳ��Գ��ֲ�ͬ�ĳ������ֹ�����ͬʵ�ֵ������
		abs = new RefinedAbstraction(implementor);
		abs.operation();
		// ���󻯽�ɫ������ʱ��������ʵ�ֻ���ɫ���ʵ��
		abs.setImplementor(new ConcreteImplementor());
		abs.operation();
	}

	static abstract class Abstraction {
		
		// ֱ�ӹ�������ʵ�ֻ���ɫ
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
		 * ĳ��ҵ�񷽷�
		 */
		public void operation() {
			// ֱ��ί�ɸ�ʵ�ֻ�����
			getImplementor().operationImpl();
		}
	}

	static class RefinedAbstraction extends Abstraction {

		public RefinedAbstraction(ConcreteImplementor implementor) {
			super(implementor);
		}

		/**
		 * �ı������ҵ�񷽷��Ķ���
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