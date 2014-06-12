/**
 * 
 */
package pattern.State;

/**
 * 具体状态(ConcreteState)角色
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-5-24
 */
public class ConcreteStateB implements State {

    private Context context;

	public ConcreteStateB(Context context) {
		this.context = context;
	}

	@Override
	public void stateOperation() {
		System.out.println("ConcreteStateB.stateOperation():set Comtext state=ConcreteStateA");
		context.setState(new ConcreteStateA(context));
	}
}