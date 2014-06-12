/**
 * 
 */
package pattern.Builder;

/**
 * �����Ʒ��
 * <p>
 * һ����˵��ÿ��һ����Ʒ�࣬����һ����Ӧ�ľ��彨�����ࡣ
 * ��Щ��ƷӦ����һ����Ŀ���������ÿ��һ���������Ӧ�������еĽ����߽�ɫ����һ�����췽����
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-3-16
 */
public class ConcreteProduct implements Product {

	private int part1;// ���1
	private String part2;// ���2
	
	ConcreteProduct() {
		// do nothing
	}

	public int getPart1() {
		return part1;
	}

	void setPart1(int part1) {
		this.part1 = part1;
	}

	public String getPart2() {
		return part2;
	}

	void setPart2(String part2) {
		this.part2 = part2;
	}
	
	public String toString(){
		return "part1=" + part1 + "#part2=" + part2; 
	}
}