/**
 * 
 */
package pattern.Memento.doubleitf;


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
		// �������ͨ��ǿ������ת��������ConcreteClass�Ŀ�ӿ�
		// ����ConcreteClass��û�дﵽ��User���ṩ��ӿڶ�Other���ṩխ�ӿڵ�Ŀ��
		ConcreteClass cclass = (ConcreteClass) getNarrow();
		cclass.operation1();
		cclass.operation2();
	}
}