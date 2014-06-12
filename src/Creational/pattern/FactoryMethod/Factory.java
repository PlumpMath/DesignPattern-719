/**
 * 
 */
package pattern.FactoryMethod;

/**
 * 抽象工厂接口
 * <p>
 * 这个类是工厂方法模式的核心，它是与应用程序无关的
 * 任何在模式中创建对象的工厂类必须实现这个接口
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-2-3
 */
public interface Factory {

	/**
	 * 创建Product的实例
	 */
	public Product create();
}