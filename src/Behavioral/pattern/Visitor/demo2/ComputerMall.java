/**
 * 
 */
package pattern.Visitor.demo2;

import java.util.List;

/**
 * 电脑商城
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-22
 */
public class ComputerMall {

	/**
	 * 接受订单，并打印报表
	 */
	public void order(List<Equipment> equipments) {
		// 分析订单数量信息
		PartAmountVisitor invVisitor = new PartAmountVisitor();
		for (Equipment equipment : equipments) {
			equipment.accept(invVisitor);
		}
		System.out.println("所有零件总量=" + invVisitor.getPartsAmount());
		System.out.println("CPU总量=" + invVisitor.getCpus());
		System.out.println("Case总量=" + invVisitor.getCases());
		System.out.println("Mainboard总量=" + invVisitor.getMainboards());
		System.out.println("HardDisk总量=" + invVisitor.getHarddisks());
		System.out.println("IntegratedBoard总量=" + invVisitor.getIntegratedBoards());
		System.out.println("PC总量=" + invVisitor.getPcs());
		System.out.println();
		// 分析订单原始价格信息
		DefaultPriceVisitor prcVisitor = new DefaultPriceVisitor();
		for (Equipment equipment : equipments) {
			equipment.accept(prcVisitor);
		}
		System.out.println("所有商品原价共计=" + prcVisitor.getTotalPrice());
		System.out.println();
		// 分析订单VIP价格信息
		VipPriceVisitor vipVisitor = new VipPriceVisitor();
		for (Equipment equipment : equipments) {
			equipment.accept(vipVisitor);
		}
		System.out.println("所有商品VIP优惠价共计=" + vipVisitor.getVipTotalPrice());
		System.out.println();
		// 分析订单折扣价格信息
		DiscountPriceVisitor disVisitor = new DiscountPriceVisitor();
		for (Equipment equipment : equipments) {
			equipment.accept(disVisitor);
		}
		System.out.println("所有商品原价共计=" + disVisitor.getTotalPrice());
		System.out.println("所有商品折扣价共计=" + disVisitor.getDiscountPrice());
		System.out.println();
	}
}