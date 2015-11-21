/**
 * 
 */
package pattern.Builder;

/**
 * 导演者角色
 * <p>
 * 担任这个角色的类调用具体建造者角色以创建产品对象。
 * 导演者角色并没有产品类的具体知识，真正拥有产品类的具体知识的是具体建造者角色。
 * <p>
 * 导演者角色将客户端创建产品的请求划分为对各个零件的建造请求，再将这些请求委派给具体建造者角色。
 * 具体建造者角色是做具体建造工作的，但是却不为客户端所知。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-3-16
 */
public class Director {

	private Builder builder;// 建造器
	
	/**
	 * @param builder 建造器
	 */
	public Director(Builder builder){
		this.builder = builder;
	}
	
	/**
	 * 建造对象
	 */
	public void construct(){
		builder.buildPart1();
		builder.buildPart2();
	}
}
