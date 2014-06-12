/**
 * 
 */
package pattern.State;

/**
 * 具体状态(ConcreteState)角色
 * <p>
 * 每一个具体状态类都实现了环境(Context)的一个状态所对应的行为。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-5-24
 */
public class ConcreteStateA implements State {

	// 如果需要可以持有环境对象的引用
	private Context context;

	public ConcreteStateA(Context context) {
		this.context = context;
	}

	@Override
	public void stateOperation() {
		System.out.println("ConcreteStateA.stateOperation():set Comtext state=ConcreteStateB");
		// 重新设置环境对象的状态
		context.setState(new ConcreteStateB(context));
	}
}