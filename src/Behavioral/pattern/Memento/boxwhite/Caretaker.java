/**
 * 
 */
package pattern.Memento.boxwhite;

/**
 * 负责人(Caretaker)角色
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-7-14
 */
public class Caretaker {

	private Memento memento;// 备忘录对象

	/**
	 * 取回备忘录
	 */
	public Memento retrieveMemento() {
		return memento;
	}

	/**
	 * 保存备忘录
	 */
	public void saveMemento(Memento memento) {
		this.memento = memento;
	}
}
