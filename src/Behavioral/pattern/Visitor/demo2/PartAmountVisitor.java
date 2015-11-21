/**
 * 
 */
package pattern.Visitor.demo2;

/**
 * 零件总量访问者
 * <p>
 * 用于计算订单中各个零件总量
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-20
 */
public class PartAmountVisitor implements Visitor {

	private int cpus = 0;// CPU总量
	private int cases = 0;// 机箱总量
	private int mainboards = 0;// 主板总量
	private int harddisks = 0;// 硬盘总量
	private int integratedBoards = 0;// 集成主板总量
	private int pcs = 0;// PC总量

	/**
	 * CPU总量
	 */
	public int getCpus() {
		return cpus;
	}

	/**
	 * 机箱总量
	 */
	public int getCases() {
		return cases;
	}

	/**
	 * 主板总量
	 */
	public int getMainboards() {
		return mainboards;
	}

	/**
	 * 硬盘总量
	 */
	public int getHarddisks() {
		return harddisks;
	}

	/**
	 * 集成主板总量
	 */
	public int getIntegratedBoards() {
		return integratedBoards;
	}

	/**
	 * PC总量
	 */
	public int getPcs() {
		return pcs;
	}

	/**
	 * 所有零件总量
	 */
	public int getPartsAmount() {
		return cpus + cases + mainboards + harddisks;
	}

	@Override
	public void visitCPU(CPU cpu) {
		cpus++;
	}

	@Override
	public void visitCase(Case e) {
		cases++;
	}

	@Override
	public void visitHardDisk(HardDisk hardDisk) {
		harddisks++;
	}

	@Override
	public void visitIntegratedBoard(IntegratedBoard integratedboard) {
		integratedBoards++;
	}

	@Override
	public void visitMainboard(Mainboard mainboard) {
		mainboards++;
	}

	@Override
	public void visitPC(PC pc) {
		pcs++;
	}
}
