/**
 * 
 */
package pattern.Memento.boxblack;

/**
 * 负责人(Caretaker)角色
 * <p>
 * 1，负责保存备忘录对象。
 * 2，不检查备忘录对象的内容。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-7-14
 */
public class Caretaker {

	private IMemento memento;// 备忘录对象

	/**
	 * 取回备忘录
	 */
	public IMemento retrieveMemento() {
		return memento;
	}

	/**
	 * 保存备忘录
	 */
	public void saveMemento(IMemento memento) {
		this.memento = memento;
	}
}
