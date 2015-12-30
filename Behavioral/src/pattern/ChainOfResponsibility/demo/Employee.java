/**
 * 
 */
package pattern.ChainOfResponsibility.demo;

/**
 * 员工
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-1
 */
public class Employee {

	private String name;// 员工姓名

	public Employee(String name) {
		this.name = name;
	}

	/**
	 * 向领导发送请求
	 * 
	 * @param handler
	 *            领导
	 * @param request
	 *            请求
	 */
	public void request(Handler handler, Request request) {
		System.out.println("员工 " + name + " 请求 " + request.getDescription());
		handler.handleRequest(request);
		System.out.println();
	}
}
