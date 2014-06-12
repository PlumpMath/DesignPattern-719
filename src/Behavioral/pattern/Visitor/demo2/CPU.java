/**
 * 
 */
package pattern.Visitor.demo2;

/**
 * CPU
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-20
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