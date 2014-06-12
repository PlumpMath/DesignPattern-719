/**
 * 
 */
package pattern.Visitor.demo2;

/**
 * Ӳ��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-20
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