/**
 * 
 */
package pattern.Builder.demo2;

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
		IHamburger ham = builder.getHamburger();// ȡ�������õĺ���
		System.out.println(ham);
		System.out.println();
		
		builder = new ChickenHamburgerBuilder();
		cook.setBuilder(builder);
		cook.construct();
		ham = builder.getHamburger();
		System.out.println(ham);
		System.out.println();
		
		builder = new FishHamburgerBuilder();
		cook.setBuilder(builder);
		cook.construct();
		ham = builder.getHamburger();
		System.out.println(ham);
	}

}

/**
 * ���⺺����
 * <p>
 * ���Ǻ����³��ֵĺ���Ʒ�֣���������ģʽ֧�ֿ���չ��
 */
class FishHamburger extends AbstractHamburger {

	FishHamburger() {
		super();
		System.out.println("This is fish hamburger.");
	}
}

/**
 * ���⺺����������
 * <p>
 * ���Ǻ����³��ֵĺ�������������������ģʽ֧�ֿ���չ��
 */
class FishHamburgerBuilder implements HamburgerBuilder {

	private FishHamburger hamburger;

	public void createHamburger() {
		hamburger = new FishHamburger();
	}

	public void addBread() {
		hamburger.setBread("two bread");
	}

	public void addMeat() {
		hamburger.setMeat("fish");
	}

	public void addVegetable() {
		hamburger.setVegetable("laver");
	}

	public IHamburger getHamburger() {
		return hamburger;
	}
}