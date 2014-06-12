/**
 * 
 */
package pattern.SimpleFactory.demo;

/**
 * 葡萄
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-2-3
 */
public class Grape implements Fruit {

	private boolean seedless;// 无籽的
	
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
	 * 是否无籽
	 */
	public boolean isSeedless() {
		return seedless;
	}

	/**
	 * @param seedless
	 *            是否无籽
	 */
	public void setSeedless(boolean seedless) {
		this.seedless = seedless;
	}
}