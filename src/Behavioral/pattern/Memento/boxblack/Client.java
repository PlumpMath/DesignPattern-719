/**
 * 
 */
package pattern.Memento.boxblack;

/**
 * 客户端
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-7-14
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Caretaker caretaker = new Caretaker();
		Originator originator = new Originator();
		originator.setState("ON");
		// 发起人创建一个当前状态的备忘录交给负责人保存
		caretaker.saveMemento(originator.createMemento());
		originator.setState("OFF");
		// 发起人从负责人那里取回备忘录对象并据此恢复状态
		originator.restoreMemento(caretaker.retrieveMemento());
	}
}
