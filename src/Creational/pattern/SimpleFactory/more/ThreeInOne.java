/**
 * 
 */
package pattern.SimpleFactory.more;

/**
 * 5.三个角色全部合并
 * <p>
 * 如果抽象产品角色已经被省略，而工厂角色就可以与具体产品角色合并，即产品类本身也是它自己的工厂。
 * 这种退化的简单工厂模式与单例(多例)模式有些相似，但不等同。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-2-4
 */
public class ThreeInOne {

}

class ConProductClient {

	@SuppressWarnings("unused")
	static void consume() {
		ConProduct product = ConProduct.getInstance();
	}
}

class ConProduct {

	static ConProduct getInstance() {
		return new ConProduct();
	}
}
