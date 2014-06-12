/**
 * 
 */
package pattern.Visitor.demo1.after;

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

	@Override
	public void accept(IncomeVisitor visitor) {
		visitor.visit(this);
	}
}