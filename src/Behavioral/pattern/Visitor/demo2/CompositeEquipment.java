/**
 * 
 */
package pattern.Visitor.demo2;

import java.util.ArrayList;
import java.util.List;

/**
 * �ϳ��豸����
 * <p>
 * �ɶ���豸��ɵ��豸���úϳ�ģʽʵ�֡�
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-20
 */
public abstract class CompositeEquipment implements Equipment {

	// �������豸
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
	 * ���ܷ������԰�����ÿ���豸����������ܷ���
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