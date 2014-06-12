package pattern.Mediator.demo3.after;

import java.util.Random;

/**
 * ������
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-8
 */
public class Sale  extends AbstractColleague { 
	
	public Sale(Mediator mediator) {
		super(mediator);
		// ��Sale����ע�ᵽMediator
		mediator.setSale(this);
	}

	/**
	 * ����ָ�������ĵ���
	 * 
	 * @param number
	 *            ����
	 */
	public void sellComputer(int number) {
		// �漰����������ͨ�ŵĲ���������Mediator���
		getMediator().execute("sale.sell", number);
	}

	/**
	 * ����״����0��100֮��仯��0���������û������100����ǳ�����
	 */
	public int getSaleStatus() {
		// ֻ�漰���������Ĳ������Բ�ͨ��Mediator���
		int saleStatus = new Random().nextInt(100);
		log("�����������Ϊ " + saleStatus);
		return saleStatus;
	}

	/**
	 * �ۼ�����
	 */
	public void offSale() {
		// �漰����������ͨ�ŵĲ���������Mediator���
		getMediator().execute("sale.offsell", 0);
	}

	/**
	 * ��ӡ��־��Ϣ
	 */
	public void log(String message) {
		System.out.println("�������顿" + message);
	}
}