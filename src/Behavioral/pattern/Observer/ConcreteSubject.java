/**
 * 
 */
package pattern.Observer;

/**
 * ��������(ConcreteSubject)��ɫ
 * <p>
 * �����״̬���������������ھ���������ڲ�״̬�ı�ʱ�������еǼǹ��Ĺ۲��߷���֪ͨ��
 * ���������ɫ�ֽ������屻�۲��߽�ɫ(Concrete Observable)��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-5-10
 */
public class ConcreteSubject extends Subject {

	private String state;// �ڲ�״̬
	
	public String getState() {
		return state;
	}

	/**
	 * �޸�״̬
	 */
	public void setState(String state) {
		this.state = state;
		// ״̬�仯�ˣ�֪ͨ���еĹ۲���
		notifyObservers();
	}
}