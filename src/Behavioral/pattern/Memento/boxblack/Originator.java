/**
 * 
 */
package pattern.Memento.boxblack;

/**
 * 发起人(Originator)角色
 * <p>
 * 1，创建一个含有其当前内部状态的备忘录对象。
 * 2，使用备忘录对象恢复其内部状态。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-7-14
 */
public class Originator {

	private String state;// 状态

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
	public IMemento createMemento() {
		return new Memento(this.getState());
	}

	/**
	 * 根据备忘录恢复其状态
	 */
	public void restoreMemento(IMemento memento) {
		this.setState(((Memento) memento).getState());
	}
	
	
	/**
	 * 备忘录(Memento)角色
	 * <p>
	 * 1，将发起人对象的内部状态存储起来。
	 * 2，备忘录可以保护其内容不被发起人对象之外的任何对象所读取。
	 * <p>
	 * 备忘录有两个等效的接口：</br>
	 * <li>窄接口(narrow interface)：</br>
	 * 负责人对象(和其他除发起人对象之外的任何对象)看到的是备忘录的窄接口，这个窄接口只允许它把备忘录对象传给其他的对象。
	 * <li>宽接口(wide interface)：</br>
	 * 与负责人对象看到的窄接口相反的是，发起人对象可以看到一个宽接口，
	 * 这个宽接口允许它读取所有的数据，以便根据这些数据恢复这个发起人对象的内部状态。
	 */
	private static class Memento implements IMemento {

		private String state;// 发起人状态

		private Memento(String state) {
			this.state = state;
		}

		/**
		 * private修饰访问方法保证只有Originator对象可以读取其内容
		 */
		private String getState() {
			return state;
		}
	}
}