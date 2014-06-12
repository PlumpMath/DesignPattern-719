/**
 * 
 */
package pattern.State;

/**
 * ����״̬(ConcreteState)��ɫ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-5-24
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