/**
 * 
 */
package pattern.Mediator.more;

/**
 * 具体调停者对象的内部状态演示
 * <p>
 * 2，在决定实现调停者模式的时候，要决定谁来负责维护调停者对象的内部状态。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-9
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
 * Mediator1、Colleague1和Colleague2类演示了
 * 由同事对象维护所有的具体调停者对象的内部状态
 */
class Mediator1 {
	
	private Colleague1 colleague1;
	private Colleague2 colleague2;

	// 调停者有空构造方法
	
	public Colleague1 getColleague1() {
		return colleague1;
	}

	public Colleague2 getColleague2() {
		return colleague2;
	}

	// 调停者提供改变自身状态的public方法，供同事对象调用
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
	 * 创建同事对象的时候就已经知道调停者对象
	 */
	public Colleague1(Mediator1 mediator1) {
		this.mediator1 = mediator1;
		// 同事对象维护调停者对象的状态
		mediator1.setColleague1(this);
	}

	// 不提供调停者对象的set方法
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
 * Mediator2、ColleagueA和ColleagueB类演示了
 * 由具体调停者对象自己维护自己的内部状态。
 */
class Mediator2 {
	
	private ColleagueA colleagueA;
	private ColleagueB colleagueB;
	
	/**
	 * 创建调停者对象的时候就已经知道了相关同事对象
	 */
	public Mediator2(ColleagueA colleagueA, ColleagueB colleagueB) {
		this.colleagueA = colleagueA;
		this.colleagueB = colleagueB;
		// 将调停者对象反设给同事对象
		colleagueA.setMediator2(this);
		colleagueB.setMediator2(this);
	}

	// 调停者对象不提供改变自身状态的public方法，完全由自己维护内部状态
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

	// 具体同事有空构造方法，创建同事对象时暂不需要调停者对象
	
	public Mediator2 getMediator2() {
		return mediator2;
	}

	// 提供设置调停者对象的public方法，供外部对象调用
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