/**
 * 
 */
package pattern.AbstractFactory;

/**
 * 抽象工厂接口
 * <p>
 * 这个类是工厂方法模式的核心，是与应用系统的商业逻辑无关的
 * <p>
 * 假设一个子系统需要一些产品对象，而这些产品对象又属于一个以上的产品等级结构。
 * 那么为了将消费这些产品对象的责任和创建这些产品对象的责任分割开来，可以引进抽象工厂模式。
 * 这样消费产品的客户端不需要直接参与产品的创建工作，而只需要向一个公用的工厂接口请求所需要的产品。
 * 也就是说抽象工厂模式可以处理具有相同(或者类似)等级结构的多个产品族中的产品对象的创建问题。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-2-3
 */
public interface Factory {

	/**
	 * ProductA、ProductB都是产品等级结构
	 * ProductA对象和ProductB对象形成一个产品族
	 * 一般而言：
	 * 有多少个产品等级结构就会在工厂中有多少个工厂方法
	 * 每一个产品等级结构中有多少个具体产品就会有多少个产品族
	 * 也就会在工厂等级结构中有多少个具体工厂
	 */
	
	/**
	 * 创建ProductA的实例
	 */
	public ProductA createA();
	
	/**
	 * 创建ProductB的实例
	 */
	public ProductB createB();
}
