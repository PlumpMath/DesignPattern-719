/**
 * 
 */
package pattern.Memento.more;

/**
 * 假如协议模式演示
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-7-16
 */
public class SupposeProtocolDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SupposeProtocolOriginator originator = new SupposeProtocolOriginator();
		originator.setState("ON");
		System.out.println(originator);
		originator.operation1();
		System.out.println(originator);
		originator.operation2();
		System.out.println(originator);
	}
}

/**
 * 发起人角色
 * <p>
 * 兼任负责人，使用假如协议模式实现，它实际上是备忘录模式的一个变种
 */
class SupposeProtocolOriginator implements Cloneable {

	private String state;// 状态

	private Memento memento;// 备忘录

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
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

	/**
	 * 演示备忘录模式的操作过程
	 * <p>
	 * 1，创建一个备忘录对象；
	 * 2，执行某个操作，这个操作是可以撤销的；
	 * 3，检查对象所处状态的有效性，可以由对象自己内部检查，也可以由某个外部对象进行检查；
	 * 4，如果需要的话，将操作撤销，也就是根据备忘录对象将发起人对象的状态恢复过来。
	 * <p>
	 * 先备份，再去做操作，失败了之后使用备份进行状态恢复
	 */
	public void operation1() {
		try {
			createMemento();
			// do something and this.state changed then Exception occured
			setState("Unkown");
			throw new RuntimeException();
		} catch (Exception e) {
			System.out.println("Exception occured.");
			restoreMemento();
		}
	}

	/**
	 * 假如协议模式的操作过程
	 * <p>
	 * 1，将发起人对象进行克隆，生成一个拷贝；
	 * 2，在拷贝上执行某个操作；
	 * 3，检查拷贝对象所处状态的有效性，可以由对象自己内部检查，也可以由某个外部对象进行检查；
	 * 4，如果检查结果是无效的，那么就扔掉这个拷贝并触发异常处理程序；如果检查结果是有效的，则在原对象上执行这个操作。
	 * <p>
	 * 先克隆，再使用克隆对象去做操作，失败了就扔掉克隆对象，一点都不影响原对象，成功了则再使用原对象去做操作。
	 * <p>
	 * 这对于撤销一个操作并恢复操作前状态较为复杂和困难的发起人对象来说，是一个谨慎有效的做法。
	 * 它的优点是可以保证发起人对象永远不会处于无效状态。
	 * 它的缺点是成功的操作必须执行两次，如果操作的成功率较低的话，这样做还比较划算。
	 * 注意：在有些情况下，拷贝和原对象均有共享的数据，这时候无论修改拷贝还是原对象都会导致数据被修改。
	 */
	public void operation2() {
		try {
			SupposeProtocolOriginator clone = (SupposeProtocolOriginator) clone();
			// do something and clone.state changed then Exception occured
			clone.setState("Unkown");
			throw new RuntimeException();
		} catch (Exception e) {
			System.out.println("Exception occured.");
		}
		// redo something for this -- the real object
	}

	/**
	 * 克隆实际上也是备忘录的一种
	 * 
	 * @see java.lang.Object#clone()
	 */
	@Override
	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}

	public String toString() {
		return "state = " + getState();
	}

	private static class Memento {

		private String state;// 发起人状态

		private Memento(String state) {
			this.state = state;
		}

		private String getState() {
			return state;
		}
	}
}