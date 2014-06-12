/**
 * 
 */
package pattern.Memento.boxwhite;

/**
 * 发起人(Originator)角色
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-7-14
 */
public class Originator {

	private String state;// 内部状态

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
		System.out.println("now state is " + state);
	}

	/**
	 * 创建当前状态的一个备忘录
	 */
	public Memento createMemento() {
		return new Memento(this.getState());
	}

	/**
	 * 根据备忘录恢复其状态
	 */
	public void restoreMemento(Memento memento) {
		this.setState(memento.getState());
	}
}