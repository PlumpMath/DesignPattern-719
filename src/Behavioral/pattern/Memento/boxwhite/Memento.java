/**
 * 
 */
package pattern.Memento.boxwhite;

/**
 * ����¼(Memento)��ɫ
 * <p>
 * ���ڱ�����¼��ɫ���κζ����ṩһ����ӿڣ�
 * ����¼��ɫ���������洢��״̬�Ͷ����ж��󹫿���
 * ������ʵ�ֽ����׺�ʵ�֡�
 * �׺�ʵ�ֽ������˽�ɫ��״̬�洢��һ���κζ����ܷ��ʵĵط���
 * ������ƻ���װ�Եġ�
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-7-14
 */
public class Memento {

	private String state;// ������״̬

	public Memento(String state) {
		this.state = state;
	}

	/**
	 * public���η��ʷ���ʹ���κζ��󶼿��Զ�ȡ������
	 */
	public String getState() {
		return state;
	}
}