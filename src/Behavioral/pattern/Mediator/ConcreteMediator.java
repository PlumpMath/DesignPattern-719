/**
 * 
 */
package pattern.Mediator;

/**
 * �����ͣ�߽�ɫ
 * <p>
 * �ӳ����ͣ�߼̳ж�����ʵ���˳��������������¼�������
 * �����ͣ����֪�����еľ���ͬ���࣬���Ӿ���ͬ�¶��������Ϣ�������ͬ�¶��󷢳���Ϣ��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-8
 */
public class ConcreteMediator implements Mediator {

	// ��ͣ�߸���Э��������(���Ը���)����ͬ�¶��󣬱���ֻ��������������ĵ�ͣ
	private ConcreteColleague1 colleague1;
	private ConcreteColleague2 colleague2;

	private ConcreteColleague1 getColleague1() {
		return colleague1;
	}

	public void setColleague1(ConcreteColleague1 colleague1) {
		this.colleague1 = colleague1;
	}

	private ConcreteColleague2 getColleague2() {
		return colleague2;
	}

	public void setColleague2(ConcreteColleague2 colleague2) {
		this.colleague2 = colleague2;
	}

	/**
	 * �¼�������ʵ��
	 *
	 * @see pattern.Mediator.Mediator#colleagueChanged(java.lang.String)
	 */
	@Override
	public void colleagueChanged(String id) {
		if ("1".equals(id)) {// colleague1��������Ϣ
			System.out.println("colleague1 invokes colleague2.action()");
			getColleague2().action();// ��colleague2��ͨ��
		} else if ("2".equals(id)) {// colleague2��������Ϣ
			System.out.println("colleague2 invokes colleague1.action()");
			getColleague1().action();// ��colleague1��ͨ��
		}
	}
}