/**
 * 
 */
package pattern.State;

/**
 * ����״̬(ConcreteState)��ɫ
 * <p>
 * ÿһ������״̬�඼ʵ���˻���(Context)��һ��״̬����Ӧ����Ϊ��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-5-24
 */
public class ConcreteStateA implements State {

	// �����Ҫ���Գ��л������������
	private Context context;

	public ConcreteStateA(Context context) {
		this.context = context;
	}

	@Override
	public void stateOperation() {
		System.out.println("ConcreteStateA.stateOperation():set Comtext state=ConcreteStateB");
		// �������û��������״̬
		context.setState(new ConcreteStateB(context));
	}
}