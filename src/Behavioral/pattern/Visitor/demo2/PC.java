/**
 * 
 */
package pattern.Visitor.demo2;

/**
 * PC
 * <p>
 * 包括一个集成主板，一个机箱，一个硬盘
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-20
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
	 * 接受方法
	 * <p>
	 * 先让访问器访问自己，然后再访问自己包含的每个设备
	 * 
	 * @see pattern.Visitor.demo2.CompositeEquipment#accept(pattern.Visitor.demo2.Visitor)
	 */
	@Override
	public void accept(Visitor visitor) {
		visitor.visitPC(this);
		super.accept(visitor);
	}
}