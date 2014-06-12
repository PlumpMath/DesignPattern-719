/**
 * 
 */
package pattern.Visitor.demo2;

/**
 * VIP价格访问者
 * <p>
 * 用于为VIP用户计算订单价格(有相应折扣)
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-20
 */
public class VipPriceVisitor implements Visitor {

	// 总价
	private double vipTotalPrice = 0;

	@Override
	public void visitCPU(CPU cpu) {
		double p = cpu.getPrice() * 0.9;// CPU打9折
		System.out.println("CPU VIP优惠价：" + p);
		vipTotalPrice += p;
	}

	@Override
	public void visitCase(Case e) {
		double p = e.getPrice() * 0.9;// 机箱打9折
		System.out.println("Case VIP优惠价：" + p);
		vipTotalPrice += p;
	}

	@Override
	public void visitHardDisk(HardDisk hardDisk) {
		double p = hardDisk.getPrice() * 0.85;// 硬盘打85折
		System.out.println("HardDisk VIP优惠价：" + p);
		vipTotalPrice += p;
	}

	@Override
	public void visitIntegratedBoard(IntegratedBoard integratedboard) {
		// 折扣都算在零件里面了，所以总体不再另外打折
		// do nothing
	}

	@Override
	public void visitMainboard(Mainboard mainboard) {
		double p = mainboard.getPrice() * 0.8;// 主板打8折
		System.out.println("Mainboard VIP优惠价：" + p);
		vipTotalPrice += p;
	}

	@Override
	public void visitPC(PC pc) {
		// 折扣都算在零件里面了，所以总体不再另外打折
		// do nothing
	}

	/**
	 * 总价
	 */
	public double getVipTotalPrice() {
		return vipTotalPrice;
	}
}