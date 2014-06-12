/**
 * 
 */
package pattern.Composite.safe;

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
		doOperation(buildComponent());
	}

	/**
	 * 创建复杂的构件
	 */
	private static Component buildComponent() {
		// 安全式的合成模式要求管理聚集的方法只出现在树枝构件类中，而不出现在树叶构件类中
		// 所以如果要管理子对象，就需要直接使用Composite进行声明了
		Composite root = new Composite();
		root.add(new Leaf());
		Composite branch1 = new Composite();
		branch1.add(new Leaf());
		branch1.add(new Leaf());
		root.add(branch1);
		Composite branch11 = new Composite();
		branch11.add(new Leaf());
		branch1.add(branch11);
		return root;
	}
	
	private static void doOperation(Component component){
		component.operation();
	}
}