/**
 * 
 */
package pattern.Builder;

/**
 * 建造者角色
 * <p>
 * 给出一个抽象接口，以规范产品对象的各个组成部分的建造。一般而言，此接口独立于应用程序的商业逻辑。
 * <p>
 * 接口中应该有两类方法：
 * 一种是建造方法，用来建造产品对象的各个零件；另一种是结果返还方法，即将建造好的产品对象返还给客户端。
 * 一般来说，产品所包含的零件数目与建造方法的数目相符。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-3-16
 */
public interface Builder {

	/**
	 * 建造零件1
	 */
	public void buildPart1();
	
	/**
	 * 建造零件2
	 */
	public void buildPart2();
	
	/**
	 * 取回组装好的Product对象
	 */
	public Product retrieve();
}
