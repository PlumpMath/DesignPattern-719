/**
 * 
 */
package pattern.State;

/**
 * ����(Context)��ɫ
 * <p>
 * ����ͻ���������Ȥ�Ľӿڣ����ұ���һ������״̬���ʵ����
 * �������״̬���ʵ�������˻����������з�����ί��ʵ�֡�
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-5-24
 */
public class Context {

	private State state;// ״̬����

	public Context() {
	}

	public Context(State state) {
		this.state = state;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	/**
	 * �ͻ��˸���Ȥ�Ĳ���
	 */
	public void operation() {
		// ί�и�״̬����
		state.stateOperation();
	}
}