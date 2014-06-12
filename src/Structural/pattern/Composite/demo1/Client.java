/**
 * 
 */
package pattern.Composite.demo1;

/**
 * �ͻ�����
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-11
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		createGraphics().draw();
	}

	private static Graphics createGraphics() {
		// ����һ��ͼ��
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