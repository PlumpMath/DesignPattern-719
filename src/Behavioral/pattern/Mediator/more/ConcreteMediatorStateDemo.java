/**
 * 
 */
package pattern.Mediator.more;

/**
 * �����ͣ�߶�����ڲ�״̬��ʾ
 * <p>
 * 2���ھ���ʵ�ֵ�ͣ��ģʽ��ʱ��Ҫ����˭������ά����ͣ�߶�����ڲ�״̬��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-9
 */
public class ConcreteMediatorStateDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Mediator1 mediator1 = new Mediator1();
		Colleague1 colleague1 = new Colleague1(mediator1);
		Colleague2 colleague2 = new Colleague2(mediator1);
		colleague1.action();
		colleague2.action();
		
		ColleagueA colleagueA = new ColleagueA();
		ColleagueB colleagueB = new ColleagueB();
		new Mediator2(colleagueA,colleagueB);
		colleagueA.action();
		colleagueB.action();
	}
}

/**
 * Mediator1��Colleague1��Colleague2����ʾ��
 * ��ͬ�¶���ά�����еľ����ͣ�߶�����ڲ�״̬
 */
class Mediator1 {
	
	private Colleague1 colleague1;
	private Colleague2 colleague2;

	// ��ͣ���пչ��췽��
	
	public Colleague1 getColleague1() {
		return colleague1;
	}

	public Colleague2 getColleague2() {
		return colleague2;
	}

	// ��ͣ���ṩ�ı�����״̬��public��������ͬ�¶������
	public void setColleague1(Colleague1 colleague1) {
		this.colleague1 = colleague1;
	}

	public void setColleague2(Colleague2 colleague2) {
		this.colleague2 = colleague2;
	}

	public void doAction() {
		// do somthing
	}
}

class Colleague1 {

	private Mediator1 mediator1;

	/**
	 * ����ͬ�¶����ʱ����Ѿ�֪����ͣ�߶���
	 */
	public Colleague1(Mediator1 mediator1) {
		this.mediator1 = mediator1;
		// ͬ�¶���ά����ͣ�߶����״̬
		mediator1.setColleague1(this);
	}

	// ���ṩ��ͣ�߶����set����
	protected Mediator1 getMediator1() {
		return mediator1;
	}

	public void action() {
		// do something
	}
}

class Colleague2 {

	private Mediator1 mediator1;

	public Colleague2(Mediator1 mediator1) {
		this.mediator1 = mediator1;
		mediator1.setColleague2(this);
	}

	protected Mediator1 getMediator1() {
		return mediator1;
	}

	public void action() {
		// do something
	}
}

/**
 * Mediator2��ColleagueA��ColleagueB����ʾ��
 * �ɾ����ͣ�߶����Լ�ά���Լ����ڲ�״̬��
 */
class Mediator2 {
	
	private ColleagueA colleagueA;
	private ColleagueB colleagueB;
	
	/**
	 * ������ͣ�߶����ʱ����Ѿ�֪�������ͬ�¶���
	 */
	public Mediator2(ColleagueA colleagueA, ColleagueB colleagueB) {
		this.colleagueA = colleagueA;
		this.colleagueB = colleagueB;
		// ����ͣ�߶������ͬ�¶���
		colleagueA.setMediator2(this);
		colleagueB.setMediator2(this);
	}

	// ��ͣ�߶����ṩ�ı�����״̬��public��������ȫ���Լ�ά���ڲ�״̬
	public ColleagueA getColleagueA() {
		return colleagueA;
	}

	public ColleagueB getColleagueB() {
		return colleagueB;
	}
	
	public void doAction(){
		// do somthing
	}
	
}

class ColleagueA {
	
	private Mediator2 mediator2;

	// ����ͬ���пչ��췽��������ͬ�¶���ʱ�ݲ���Ҫ��ͣ�߶���
	
	public Mediator2 getMediator2() {
		return mediator2;
	}

	// �ṩ���õ�ͣ�߶����public���������ⲿ�������
	public void setMediator2(Mediator2 mediator2) {
		this.mediator2 = mediator2;
	}

	public void action(){
		// do something
	}
}

class ColleagueB {
	
	private Mediator2 mediator2;

	public Mediator2 getMediator2() {
		return mediator2;
	}

	public void setMediator2(Mediator2 mediator2) {
		this.mediator2 = mediator2;
	}

	public void action(){
		// do something
	}
}