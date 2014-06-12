/**
 * 
 */
package pattern.Visitor.demo1;

/**
 * CEO
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-19
 */
public class CEO extends AbstractEmployee {

	private double ceoSpecialBonus;// ceo�ر𽱽�
	private double decemberBonus;// ���ս�

	public CEO(String name, double salary) {
		super(name, salary);
	}

	public double getCeoSpecialBonus() {
		return ceoSpecialBonus;
	}

	public void setCeoSpecialBonus(double ceoSpecialBonus) {
		this.ceoSpecialBonus = ceoSpecialBonus;
	}

	public double getDecemberBonus() {
		return decemberBonus;
	}

	public void setDecemberBonus(double decemberBonus) {
		this.decemberBonus = decemberBonus;
	}
}