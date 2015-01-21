/**
 * 
 */
package pattern.Mediator.demo2.after;

/**
 * �ɹ���
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-8
 */
public class Purchase extends AbstractColleague {

	public Purchase(Mediator mediator) {
		super(mediator);
		// ��Purchase����ע�ᵽMediator
		mediator.setPurchase(this);
	}

	/**
	 * �ɹ�ָ�������ĵ���
	 * 
	 * @param number
	 *            ����
	 */
	public void buyComputer(int number) {
		// �漰����������ͨ�ŵĲ���������Mediator���
		getMediator().buyComputer(number);
	}

	/**
	 * �ܾ��ɹ�����
	 */
	public void refuse2BuyComputer() {
		// ֻ�漰���������Ĳ������Բ�ͨ��Mediator���
		log("���ٲɹ�����");
	}

	/**
	 * ��ӡ��־��Ϣ
	 */
	public void log(String message) {
		System.out.println("���ɹ��顿" + message);
	}
}