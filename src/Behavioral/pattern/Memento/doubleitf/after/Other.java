/**
 * 
 */
package pattern.Memento.doubleitf.after;

import pattern.Memento.doubleitf.INarrow;

/**
 * ������ֻ����ʹ��ConcreteClass����խ�ӿڵ���
 * Ҳ����ֻ֪��INarrow�������֪��ConcreteClass����
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-7-15
 */
public class Other {

	private INarrow narrow;

	public INarrow getNarrow() {
		return narrow;
	}

	public void setNarrow(INarrow narrow) {
		this.narrow = narrow;
	}

	public void operation() {
		System.out.println("I cannot access narrow.");
		// ��ʱ�Ͳ��ܹ�ǿ������ת��ΪConcreteClass��
//		ConcreteClass cclass = (ConcreteClass)getNarrow();
//		cclass.operation1();
//		cclass.operation2();
	}
}