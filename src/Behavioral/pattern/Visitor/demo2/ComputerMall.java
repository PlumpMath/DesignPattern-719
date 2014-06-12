/**
 * 
 */
package pattern.Visitor.demo2;

import java.util.List;

/**
 * �����̳�
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-22
 */
public class ComputerMall {

	/**
	 * ���ܶ���������ӡ����
	 */
	public void order(List<Equipment> equipments) {
		// ��������������Ϣ
		PartAmountVisitor invVisitor = new PartAmountVisitor();
		for (Equipment equipment : equipments) {
			equipment.accept(invVisitor);
		}
		System.out.println("�����������=" + invVisitor.getPartsAmount());
		System.out.println("CPU����=" + invVisitor.getCpus());
		System.out.println("Case����=" + invVisitor.getCases());
		System.out.println("Mainboard����=" + invVisitor.getMainboards());
		System.out.println("HardDisk����=" + invVisitor.getHarddisks());
		System.out.println("IntegratedBoard����=" + invVisitor.getIntegratedBoards());
		System.out.println("PC����=" + invVisitor.getPcs());
		System.out.println();
		// ��������ԭʼ�۸���Ϣ
		DefaultPriceVisitor prcVisitor = new DefaultPriceVisitor();
		for (Equipment equipment : equipments) {
			equipment.accept(prcVisitor);
		}
		System.out.println("������Ʒԭ�۹���=" + prcVisitor.getTotalPrice());
		System.out.println();
		// ��������VIP�۸���Ϣ
		VipPriceVisitor vipVisitor = new VipPriceVisitor();
		for (Equipment equipment : equipments) {
			equipment.accept(vipVisitor);
		}
		System.out.println("������ƷVIP�Żݼ۹���=" + vipVisitor.getVipTotalPrice());
		System.out.println();
		// ���������ۿۼ۸���Ϣ
		DiscountPriceVisitor disVisitor = new DiscountPriceVisitor();
		for (Equipment equipment : equipments) {
			equipment.accept(disVisitor);
		}
		System.out.println("������Ʒԭ�۹���=" + disVisitor.getTotalPrice());
		System.out.println("������Ʒ�ۿۼ۹���=" + disVisitor.getDiscountPrice());
		System.out.println();
	}
}