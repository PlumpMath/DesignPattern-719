/**
 * 
 */
package pattern.Visitor.demo2;

/**
 * CPU
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-20
 */
public class CPU implements Equipment {

	@Override
	public void accept(Visitor visitor) {
		visitor.visitCPU(this);
	}

	@Override
	public double getPrice() {
		return 500;
	}
}