/**
 * 
 */
package pattern.Memento.boxwhite;

/**
 * 备忘录(Memento)角色
 * <p>
 * 由于本备忘录角色对任何对象都提供一个宽接口，
 * 备忘录角色的内容所存储的状态就对所有对象公开，
 * 因此这个实现叫做白盒实现。
 * 白盒实现将发起人角色的状态存储在一个任何对象都能访问的地方，
 * 因此是破坏封装性的。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-7-14
 */
public class Memento {

	private String state;// 发起人状态

	public Memento(String state) {
		this.state = state;
	}

	/**
	 * public修饰访问方法使得任何对象都可以读取其内容
	 */
	public String getState() {
		return state;
	}
}