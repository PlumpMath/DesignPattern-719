/**
 * 
 */
package pattern.ChainOfResponsibility.demo1;

/**
 * 客户端类
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-1
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 客户端定义一条责任链
		Handler chain = new DeptManager(new GeneralManager(new CEO(new Chairman())));
		// 员工向领导发送请求
		Employee tom = new Employee("tom");
		tom.request(chain, Request.LEAVE);
		// 员工向领导发送请求
		Employee peter = new Employee("peter");
		peter.request(chain, Request.RAISES);
		// 员工向领导发送请求
		Employee bob = new Employee("bob");
		bob.request(chain, Request.PROMOTION);
		// 员工向领导发送请求
		Employee ann = new Employee("ann");
		ann.request(chain, Request.OTHER);
	}
}