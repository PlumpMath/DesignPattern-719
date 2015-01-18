/**
 * 
 */
package pattern.Builder.demo1;

/**
 * �˿���
 * <p>
 * �ͻ��˽�ɫ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-3-17
 */
public class Customer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HamburgerBuilder builder = new BeefHamburgerBuilder();
		Cook cook = new Cook(builder);
		cook.construct();// ��ʼ��������
		Hamburger ham = builder.getHamburger();// ȡ�������õĺ���
		System.out.println("This is beef hamburger\n" + ham);
		System.out.println();
		
		builder = new ChickenHamburgerBuilder();
		cook.setBuilder(builder);
		cook.construct();
		ham = builder.getHamburger();
		System.out.println("This is chicken hamburger\n" + ham);
		System.out.println();
		// ���Ǻ����³��ֵ����⺺��������������ģʽ����չ�Ե�֧�֡�
		builder = new FishHamburgerBuilder();
		cook.setBuilder(builder);
		cook.construct();
		ham = builder.getHamburger();
		System.out.println("This is fish hamburger\n" + ham);
	}
}

/**
 * ���⺺����������
 * <p>
 * ���Ǻ����³��ֵĺ�������������������ģʽ֧����չ
 */
class FishHamburgerBuilder extends AbstractHamburgerBuilder {

	/**
	 * ��Ƭ���
	 */
	public void buildBread() {
		getHamburger().setBread("two bread");
	}

	/**
	 * ����
	 */
	public void buildMeat() {
		getHamburger().setMeat("fish");
	}

	/**
	 * �ϲ�
	 */
	public void buildVegetable() {
		getHamburger().setVegetable("laver");
	}
}