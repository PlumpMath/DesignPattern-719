/**
 * 
 */
package pattern.Visitor.demo2;

/**
 * PC
 * <p>
 * ����һ���������壬һ�����䣬һ��Ӳ��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-20
 */
public class PC extends CompositeEquipment {

	public PC() {
		super();
		init();
	}

	private void init() {
		addEquipment(new IntegratedBoard());
		addEquipment(new Case());
		addEquipment(new HardDisk());
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
		visitor.visitPC(this);
		super.accept(visitor);
	}
}