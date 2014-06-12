/**
 * 
 */
package pattern.Visitor.demo2;

/**
 * ��������
 * <p>
 * ����һ��CPU��һ������
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-20
 */
public class IntegratedBoard extends CompositeEquipment {

	public IntegratedBoard(){
		super();
		init();
	}

	private void init() {
		addEquipment(new CPU());
		addEquipment(new Mainboard());
	}

	/**
	 * ���ܷ���
	 * <p>
	 * ���÷����������Լ���Ȼ���ٷ����Լ�������ÿ���豸
	 *
	 * @see pattern.Visitor.demo2.CompositeEquipment#accept(pattern.Visitor.demo2.Visitor)
	 */
	@Override
	public void accept(Visitor visitor) {
		visitor.visitIntegratedBoard(this);
		super.accept(visitor);
	}
}