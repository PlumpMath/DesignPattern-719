/**
 * 
 */
package pattern.Memento.doubleitf;


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

	public void operation() {
		// ������Է���ConcreteClass���е�public����
		cclass.operation1();
		cclass.operation2();
	}
}