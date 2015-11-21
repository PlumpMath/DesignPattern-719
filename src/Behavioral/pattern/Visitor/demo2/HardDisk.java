/**
 * 
 */
package pattern.Visitor.demo2;

/**
 * 硬盘
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-20
 */
public class HardDisk implements Equipment {

	@Override
	public void accept(Visitor visitor) {
		visitor.visitHardDisk(this);
	}

	@Override
	public double getPrice() {
		return 400;
	}
}
