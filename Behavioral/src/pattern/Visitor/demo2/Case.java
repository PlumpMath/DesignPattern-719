/**
 * 
 */
package pattern.Visitor.demo2;

/**
 * 机箱
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-20
 */
public class Case implements Equipment {

	@Override
	public void accept(Visitor visitor) {
		visitor.visitCase(this);
	}

	@Override
	public double getPrice() {
		return 50;
	}
}
