/**
 * 
 */
package pattern.Memento.more;

/**
 * 自述历史模式演示
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-7-16
 */
public class HistoryOnSelfDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HistoryOnSelfOriginator originator = new HistoryOnSelfOriginator();
		originator.setState("ON");
		originator.createMemento();// 创建一份备忘录
		originator.setState("OFF");
		originator.restoreMemento();// 根据备忘录恢复状态
	}
}

/**
 * 备忘录(窄)接口
 */
interface IMemento {
}

/**
 * 自述历史模式中发起人角色自己兼任负责人角色
 * <p>
 * 由于自述历史作为一个备忘录模式的特殊实现形式非常简单易懂
 * 它可能是备忘录模式最为流行的实现形式。
 * 对于通常由独立负责人角色的实现，如果系统中有多个发起人角色的话
 * 这些发起人角色可以共享同一个负责人角色，或者在多态性前提下使用多个负责人子类型
 * 没有独立的负责人角色的自述历史实现无法做到这一点
 * 因为每一个发起人都自己兼任负责人，无法做到代码共享，所以这种实现的缺点就体现出来了
 */
class HistoryOnSelfOriginator {

	private String state;// 状态
	
	private Memento memento;// 备忘录

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
	public void createMemento() {
		this.memento = new Memento(this.getState());
	}

	/**
	 * 根据备忘录恢复其状态
	 */
	public void restoreMemento() {
		this.setState(memento.getState());
	}

	private static class Memento implements IMemento {

		private String state;// 发起人状态

		private Memento(String state) {
			this.state = state;
		}

		private String getState() {
			return state;
		}
	}
}