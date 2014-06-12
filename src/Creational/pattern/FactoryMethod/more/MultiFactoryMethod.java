/**
 * 
 */
package pattern.FactoryMethod.more;

/**
 * ʹ�ö����������
 * <p>
 * ���󹤳���ɫ�����ж���һ���Ĺ����������Ӷ�ʹ���幤����ɫʵ����Щ��ͬ�Ĺ�������
 * ��Щ���������ṩ��ͬ����ҵ�߼����������ṩ��ͬ�Ĳ�Ʒ���������
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-2-4
 */
public class MultiFactoryMethod {

}

/**
 * ʹ��Clothes�Ŀͻ�����
 */
class ClothesClient {

	private static ClothesFactory factory1;
	private static ClothesFactory factory2;
	
	static void consume() {
		factory1 = new ShirtFactory();
		factory1.create();
		factory1.create("white");
		factory2 = new JacketFactory();
		factory2.create();
		factory2.create("red");
	}
}

/**
 * Clothes�����ӿ�
 */
interface ClothesFactory {
	
	/**
	 * �����·�
	 */
	public Clothes create();
	
	/**
	 * ����ָ����ɫ���·�
	 */
	public Clothes create(String color);
}

/**
 * Shirt����
 */
class ShirtFactory implements ClothesFactory {

	public Clothes create() {
		return new Shirt();
	}

	public Clothes create(String color) {
		return new Shirt(color);
	}
}

/**
 * Jacket����
 */
class JacketFactory implements ClothesFactory {

	public Clothes create() {
		return new Jacket();
	}

	public Clothes create(String color) {
		return new Jacket(color);
	}
}

/**
 * �·�����
 */
abstract class Clothes {

	private String color;// ��ɫ

	public Clothes() {
		this.color = "black";// Ĭ�Ϻ�ɫ
	}

	public Clothes(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}

/**
 * ������
 */
class Shirt extends Clothes {

	public Shirt() {
		super();
	}

	public Shirt(String color) {
		super(color);
	}
}

/**
 * �п���
 */
class Jacket extends Clothes {

	public Jacket() {
		super();
	}

	public Jacket(String color) {
		super(color);
	}
}