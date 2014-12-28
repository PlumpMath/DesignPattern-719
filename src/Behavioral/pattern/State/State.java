/**
 * 
 */
package pattern.State;

/**
 * 抽象状态(State)角色
 * <p>
 * 定义一个接口，用以封装环境(Context)对象的一个特定的状态所对应的行为。
 * 每一个状态对应一个具体子类，每一促使状态变化的动作就是抽象状态中声明的方法。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-5-24
 */
public interface State {

	/**
	 * 行为
	 */
	public void stateOperation();
}