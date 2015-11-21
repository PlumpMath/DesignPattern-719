/**
 * 
 */
package pattern.SimpleFactory.more;

/**
 * 3.抽象产品角色的省略
 * <p>
 * 如果系统仅有一个具体产品角色的话，那么就可以省略掉抽象产品角色
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-2-4
 */
public class AbsProductOmitted {

}

/**
 * 使用具体产品类的客户端
 */
class ConcreteProductClient {

	@SuppressWarnings("unused")
	static void consume() {
		ConcreteProduct product = Factory.create();
	}
}

/**
 * 工厂类
 */
class Factory {

	static ConcreteProduct create() {
		return new ConcreteProduct();
	}
}

/**
 * 具体产品类
 */
class ConcreteProduct {
}
