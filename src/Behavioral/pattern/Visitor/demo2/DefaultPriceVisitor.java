/**
 * 
 */
package pattern.Visitor.demo2;

/**
 * 默认价格访问者
 * <p>
 * 用于为普通用户计算订单价格(原价，无折扣)
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-20
 */
public class DefaultPriceVisitor implements Visitor {

	// 总价
	private double totalPrice = 0;

	@Override
	public void visitCPU(CPU cpu) {
		System.out.println("CPU 原价：" + cpu.getPrice());
		totalPrice += cpu.getPrice();
	}

	@Override
	public void visitCase(Case e) {
		System.out.println("Case 原价：" + e.getPrice());
		totalPrice += e.getPrice();
	}

	@Override
	public void visitHardDisk(HardDisk hardDisk) {
		System.out.println("HardDisk 原价：" + hardDisk.getPrice());
		totalPrice += hardDisk.getPrice();
	}

	@Override
	public void visitIntegratedBoard(IntegratedBoard integratedboard) {
		// 价格都算在零件里面了，所以总体不再计算
		// do nothing
	}

	@Override
	public void visitMainboard(Mainboard mainboard) {
		System.out.println("Mainboard 原价：" + mainboard.getPrice());
		totalPrice += mainboard.getPrice();
	}

	@Override
	public void visitPC(PC pc) {
		// 价格都算在零件里面了，所以总体不再计算
		// do nothing
	}

	/**
	 * 总价
	 */
	public double getTotalPrice() {
		return totalPrice;
	}
}