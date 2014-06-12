/**
 * 
 */
package pattern.ChainOfResponsibility;

/**
 * 抽象处理者(Handler)角色
 * <p>
 * 本角色定义出一个处理请求的接口。
 * 如果需要，接口可以定义出一个方法，以设定和返回对下家的引用。
 * 这个角色通常由一个Java抽象类或者Java接口实现。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-1
 */
public abstract class Handler {

	// 对下家Handler的引用
	private Handler next;

	public Handler getNext() {
		return next;
	}

	/**
	 * 设置下家
	 */
	public void setNext(Handler next) {
		this.next = next;
	}

	/**
	 * 处理请求的操作
	 */
	public abstract void handleRequest();
}