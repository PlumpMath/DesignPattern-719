/**
 * 
 */
package pattern.Builder.demo1;

/**
 * ������
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-3-17
 */
public class Hamburger {

	private String bread;// ���
	private String meat;// ��
	private String vegetable;// �߲�

	Hamburger() {
	}
	
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