/**
 * 
 */
package pattern.Composite.transparent;

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
		// 透明式的合成模式要求所有的具体构件类，不论树枝构件还是树叶构件，均符合一个固定的接口。
		// 所以如果要管理子对象，可以直接使用Component进行声明了
		Component root = new Composite();
		root.add(new Leaf());
		Component branch1 = new Composite();
		branch1.add(new Leaf());
		branch1.add(new Leaf());
		root.add(branch1);
		Component branch11 = new Composite();
		branch11.add(new Leaf());
		branch1.add(branch11);
		return root;
	}
	
	private static void doOperation(Component component){
		component.operation();
	}
}
