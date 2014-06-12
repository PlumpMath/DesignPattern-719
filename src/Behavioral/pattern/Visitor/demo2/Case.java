/**
 * 
 */
package pattern.Visitor.demo2;

/**
 * ����
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-20
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