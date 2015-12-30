/**
 * 
 */
package pattern.Visitor.demo2;

/**
 * 访问器接口
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-20
 */
public interface Visitor {

	/**
	 * 访问机箱
	 */
	public void visitCase(Case e);

	/**
	 * 访问CPU
	 */
	public void visitCPU(CPU cpu);

	/**
	 * 访问主板
	 */
	public void visitMainboard(Mainboard mainboard);

	/**
	 * 访问硬盘
	 */
	public void visitHardDisk(HardDisk hardDisk);

	/**
	 * 访问集成主板
	 */
	public void visitIntegratedBoard(IntegratedBoard integratedboard);

	/**
	 * 访问PC
	 */
	public void visitPC(PC pc);
}
