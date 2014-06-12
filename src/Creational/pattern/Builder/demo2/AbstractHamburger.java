/**
 * 
 */
package pattern.Builder.demo2;

/**
 * ���󺺱�������
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-3-17
 */
public abstract class AbstractHamburger implements IHamburger {

	private String bread;// ���
	private String meat;// ��
	private String vegetable;// �߲�

	public String getBread() {
		return bread;
	}

	void setBread(String bread) {
		this.bread = bread;
	}

	public String getMeat() {
		return meat;
	}

	void setMeat(String meat) {
		this.meat = meat;
	}

	public String getVegetable() {
		return vegetable;
	}

	void setVegetable(String vegetable) {
		this.vegetable = vegetable;
	}

	public String toString() {
		return "bread:" + getBread() + "\nmeat:" + getMeat() + "\nvegetable:"
				+ getVegetable();
	}
}