/**
 * 
 */
package pattern.Visitor.demo2;

/**
 * 集成主板
 * <p>
 * 包括一个CPU和一个主板
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-20
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
	 * 接受方法
	 * <p>
	 * 先让访问器访问自己，然后再访问自己包含的每个设备
	 *
	 * @see pattern.Visitor.demo2.CompositeEquipment#accept(pattern.Visitor.demo2.Visitor)
	 */
	@Override
	public void accept(Visitor visitor) {
		visitor.visitIntegratedBoard(this);
		super.accept(visitor);
	}
}