/**
 * 
 */
package pattern.Visitor.demo2;

import java.util.ArrayList;
import java.util.List;

/**
 * 合成设备基类
 * <p>
 * 由多个设备组成的设备，用合成模式实现。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-20
 */
public abstract class CompositeEquipment implements Equipment {

	// 包含的设备
	private List<Equipment> equipments;

	protected List<Equipment> getEquipments() {
		if (equipments == null) {
			equipments = new ArrayList<Equipment>();
		}
		return equipments;
	}

	protected void addEquipment(Equipment e) {
		getEquipments().add(e);
	}

	/**
	 * 接受方法，对包含的每个设备都调用其接受方法
	 *
	 * @see pattern.Visitor.demo2.Equipment#accept(pattern.Visitor.demo2.Visitor)
	 */
	@Override
	public void accept(Visitor visitor) {
		for (Equipment e : getEquipments()) {
			e.accept(visitor);
		}
	}

	@Override
	public double getPrice() {
		double price = 0;
		for (Equipment e : getEquipments()) {
			price += e.getPrice();
		}
		return price;
	}
}