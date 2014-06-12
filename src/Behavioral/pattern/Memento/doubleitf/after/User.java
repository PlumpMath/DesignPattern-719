/**
 * 
 */
package pattern.Memento.doubleitf.after;

import pattern.Memento.doubleitf.INarrow;

/**
 * ����ʹ��ConcreteClass�����ӿڵ���
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-7-15
 */
public class User {

	private ConcreteClass cclass = new ConcreteClass();
	
	public INarrow getNarrow() {
		return cclass;
	}

	public void operation(){
		cclass.operation1();
		cclass.operation2();
	}
	
	/**
	 * ����ʵ����
	 * <p>
	 * Ŀ���Ƕ�User���ṩ��ӿڣ���Other���ṩխ�ӿ�
	 * <p>
	 * �����ڲ���ʵ�֣����ҷ����ķ��ʿ��ƶ���private
	 * �����ͱ�֤����粻�ܷ������Ŀ�ӿڣ�ֻ��User����Է������ӿ�
	 */
	private static class ConcreteClass implements INarrow {

		private void operation1() {
			System.out.println("operation1");
		}

		private void operation2() {
			System.out.println("operation2");
		}
	}
}