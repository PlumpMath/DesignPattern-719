/**
 * 
 */
package pattern.Visitor.demo2;

/**
 * 主板
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-20
 */
public class Mainboard implements Equipment {

	@Override
	public void accept(Visitor visitor) {
		visitor.visitMainboard(this);
	}

	@Override
	public double getPrice() {
		return 300;
	}
}
