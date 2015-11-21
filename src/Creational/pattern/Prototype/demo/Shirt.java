/**
 * 
 */
package pattern.Prototype.demo;

/**
 * 衬衫类
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-3-28
 */
public class Shirt implements Clothes {

	private String color;
	private int size;

	public Shirt(String color, int size) {
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
