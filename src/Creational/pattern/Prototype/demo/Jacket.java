/**
 * 
 */
package pattern.Prototype.demo;

/**
 * �п���
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-3-28
 */
public class Jacket implements Clothes {

	private String color;
	private int size;

	public Jacket(String color, int size) {
		this.color = color;
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public int getSize() {
		return size;
	}

	public Clothes clone() {
		Object object = null;
		try {
			object = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return (Clothes) object;
	}
}