/**
 * 
 */
package pattern.Decorator;

/**
 * 装饰角色
 * <p>
 * 持有一个构件(Component)对象的实例，并定义一个与抽象构件接口一致的接口。
 * <p>
 * 注：一个装饰类的接口必须与被装饰类的接口相容
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-13
 */
public abstract class Decorator implements Component {// 1，需要实现构件(Component)接口

	// 2，持有一个属性，其类型是构件(Component)
	private Component component;

	public Decorator(Component component) {
		this.component = component;
	}

	protected Component getComponent() {
		return component;
	}
}