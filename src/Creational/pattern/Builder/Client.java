/**
 * 
 */
package pattern.Builder;

/**
 * 客户端程序类
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-3-16
 */
public class Client {

	/**
	 * 客户端负责创建导演者和具体建造者对象。然后，客户把具体建造者对象交给导演者。
	 * 客户一声令下，导演者操作具体建造者，开始创建产品。
	 * 具体建造者每接到导演者的一个指令，便按照指令向产品上增加一个零件。
	 * 当产品完成后，建造者把产品返还给客户端。
	 * 虽然客户端确实负责创建具体建造者对象，但是操作具体建造者的任务却是属于导演者对象的。
	 * 把创建具体建造者对象的任务交给客户端而不是导演者对象，是为了将导演者对象与
	 * 具体建造者对象的耦合变成动态的，从而使导演者对象可以操作数个具体建造者对象中的任何一个。
	 */
	public static void main(String[] args) {
		ConcreteBuilder builder = new ConcreteBuilder();
		Director diretor = new Director(builder);
		diretor.construct();
		Product product = builder.retrieve();
		System.out.println(product.toString());
	}
}