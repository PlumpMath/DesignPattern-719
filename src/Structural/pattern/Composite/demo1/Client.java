/**
 * 
 */
package pattern.Composite.demo1;

/**
 * 客户端类
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-11
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		createGraphics().draw();
	}

	private static Graphics createGraphics() {
		// 绘制一幅图画
		Picture samllPicture = new Picture();
		samllPicture.add(new Line());
		samllPicture.add(new Circle());
		Picture picture = new Picture();
		picture.add(new Line());
		picture.add(new Circle());
		picture.add(new Rectangle());
		picture.add(samllPicture);
		return picture;
	}
}
