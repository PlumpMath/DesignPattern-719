/**
 * 
 */
package pattern.Prototype;

/**
 * 客户(Client)角色
 * <p>
 * 客户类提出创建对象的请求。
 * <p>
 * 原型模式有两种表现形式：
 * 1，简单形式
 * 2，登记形式
 * 这两种表现形式仅仅是原型模式的不同实现，但是由于它们的区别又影响了模式结构的细节。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-3-28
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		operation4Simple(new ConcretePrototypeA());
		operation4Simple(new ConcretePrototypeB());
		operation4Simple(new ConcretePrototypeC());
		operation4Register(PrototypeManager.getInstance().getPrototype("A"));
		operation4Register(PrototypeManager.getInstance().getPrototype("A"));
		operation4Register(PrototypeManager.getInstance().getPrototype("B"));
		operation4Register(PrototypeManager.getInstance().getPrototype("B"));
		operation4Register(PrototypeManager.getInstance().getPrototype("C"));
		operation4Register(PrototypeManager.getInstance().getPrototype("C"));
	}

	private static void operation4Simple(Prototype prototype) {
		Prototype p = (Prototype) prototype.clone();
		System.out.println("prototype address=" + prototype);
		System.out.println("cloned address=" + p);
	}

	private static void operation4Register(Prototype prototype) {
		System.out.println("address=" + prototype);
	}
}
