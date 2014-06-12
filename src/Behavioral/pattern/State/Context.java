/**
 * 
 */
package pattern.State;

/**
 * 环境(Context)角色
 * <p>
 * 定义客户端所感兴趣的接口，并且保留一个具体状态类的实例。
 * 这个具体状态类的实例给出此环境对象现有方法的委托实现。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-5-24
 */
public class Context {

	private State state;// 状态对象

	public Context() {
	}

	public Context(State state) {
		this.state = state;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	/**
	 * 客户端感兴趣的操作
	 */
	public void operation() {
		// 委托给状态对象
		state.stateOperation();
	}
}