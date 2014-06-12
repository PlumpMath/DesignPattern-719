/**
 * 
 */
package pattern.Memento.more;

import pattern.Memento.boxblack.IMemento;
import pattern.Memento.boxblack.Originator;

/**
 * 增强负责人示例
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-7-15
 */
public class EnhanciveCaretakerDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Originator originator = new Originator();
		EnhanciveCaretaker caretaker = new EnhanciveCaretaker(originator);
		originator.setState("ON");
		// 增强负责人为发起人创建一个当前状态的备忘录 
		caretaker.createMemento();
		originator.setState("OFF");
		// 增强负责人使用备忘录对象恢复发起人状态
		caretaker.restoreMemento();
	}
}

/**
 * 增强负责人角色
 * <p>
 * 让负责人角色调用备忘录角色和发起人角色，进行备忘录创建和根据备忘录恢复发起人状态
 * 那么客户端便不再需要协调备忘录角色和发起人角色，而只需要调用负责人角色即可
 * 要做到这一点，负责人角色就必须持有一个对发起人角色的引用
 */
class EnhanciveCaretaker {

	private Originator originator;// 发起人

	private IMemento memento;// 备忘录

	/**
	 * @param originator
	 *            发起人
	 */
	public EnhanciveCaretaker(Originator originator) {
		this.originator = originator;
	}

	/**
	 * 创建一个Originator对象当前状态的备忘录
	 */
	public void createMemento() {
		this.memento = originator.createMemento();
	}

	/**
	 * 根据备忘录恢复Originator对象的状态
	 */
	public void restoreMemento() {
		originator.restoreMemento(memento);
	}
}