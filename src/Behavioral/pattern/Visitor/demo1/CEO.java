/**
 * 
 */
package pattern.Visitor.demo1;

/**
 * CEO
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-19
 */
public class CEO extends AbstractEmployee {

	private double ceoSpecialBonus;// ceo特别奖金
	private double decemberBonus;// 年终奖

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