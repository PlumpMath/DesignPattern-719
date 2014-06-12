/**
 * 
 */
package pattern.SimpleFactory.demo;

/**
 * 苹果
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-2-3
 */
public class Apple implements Fruit {

	private int treeAge;// 树龄
	
	@Override
	public void grow() {
		System.out.println("Apple is growing.");
	}

	@Override
	public void harvest() {
		System.out.println("Apple has been harvested.");
	}

	@Override
	public void plant() {
		System.out.println("Apple has been planted.");
	}

	/**
	 * 返回树龄
	 */
	public int getTreeAge() {
		return treeAge;
	}

	/**
	 * @param treeAge
	 *            树龄
	 */
	public void setTreeAge(int treeAge) {
		this.treeAge = treeAge;
	}
}