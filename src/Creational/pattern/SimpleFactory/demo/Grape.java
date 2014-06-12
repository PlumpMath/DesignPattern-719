/**
 * 
 */
package pattern.SimpleFactory.demo;

/**
 * ����
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-2-3
 */
public class Grape implements Fruit {

	private boolean seedless;// ���ѵ�
	
	@Override
	public void grow() {
		System.out.println("Grape is growing.");
	}

	@Override
	public void harvest() {
		System.out.println("Grape has been harvested.");
	}

	@Override
	public void plant() {
		System.out.println("Grape has been planted.");
	}

	/**
	 * �Ƿ�����
	 */
	public boolean isSeedless() {
		return seedless;
	}

	/**
	 * @param seedless
	 *            �Ƿ�����
	 */
	public void setSeedless(boolean seedless) {
		this.seedless = seedless;
	}
}