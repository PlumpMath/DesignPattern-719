/**
 * 
 */
package pattern.Visitor.demo2;

/**
 * 过节折扣价格访问者
 * <p>
 * 用于过节打折时计算订单价格
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-20
 */
public class DiscountPriceVisitor implements Visitor {

	private int number = 0;// 零件数量
	private double totalPrice = 0;// 总价

	@Override
	public void visitCPU(CPU cpu) {
		number++;
		totalPrice += cpu.getPrice();
	}

	@Override
	public void visitCase(Case e) {
		number++;
		totalPrice += e.getPrice();
	}

	@Override
	public void visitHardDisk(HardDisk hardDisk) {
		number++;
		totalPrice += hardDisk.getPrice();
	}

	@Override
	public void visitIntegratedBoard(IntegratedBoard integratedboard) {
		// 价格和数量都算在零件里面了，所以总体不再计算
		// do nothing
	}

	@Override
	public void visitMainboard(Mainboard mainboard) {
		number++;
		totalPrice += mainboard.getPrice();
	}

	@Override
	public void visitPC(PC pc) {
		// 价格和数量都算在零件里面了，所以总体不再计算
		// do nothing
	}

	/**
	 * 总价
	 */
	public double getTotalPrice() {
		return totalPrice;
	}

	/**
	 * 折扣价格
	 */
	public double getDiscountPrice() {
		// 5个之内打95折，20之内打9折，多于20打85折
		if (number < 5) {
			System.out.println("购买零件总量：" + number + "【95折】");
			return totalPrice * 0.95;
		} else if (number < 20) {
			System.out.println("购买零件总量：" + number + "【9折】");
			return totalPrice * 0.9;
		} else {
			System.out.println("购买零件总量：" + number + "【85折】");
			return totalPrice * 0.85;
		}
	}
}
