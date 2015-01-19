/**
 * 
 */
package pattern.SimpleFactory.more;

/**
 * 2.�����������
 * <p>
 * ����������ж���һ���Ĺ����������ֱ��𴴽���ͬ�Ĳ�Ʒ����
 * JDK�е�java.text.DateFormat��������������ӡ�
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

	static void consume() {
		ClothesFactory.create("Shirt");
		ClothesFactory.create("Shirt", "white");
		ClothesFactory.create("Jacket");
		ClothesFactory.create("Jacket", "red");
	}
}

class ClothesFactory {

	/**
	 * ����ָ��Ʒ�ֵ��·�
	 */
	static Clothes create(String which) {
		if (which.equalsIgnoreCase("Shirt")) {
			return new Shirt();
		} else if (which.equalsIgnoreCase("Jacket")) {
			return new Jacket();
		}
		return null;
	}

	/**
	 * ����ָ��Ʒ�ֺ���ɫ���·�
	 */
	static Clothes create(String which, String color) {
		if (which.equalsIgnoreCase("Shirt")) {
			return new Shirt(color);
		} else if (which.equalsIgnoreCase("Jacket")) {
			return new Jacket(color);
		}
		return null;
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