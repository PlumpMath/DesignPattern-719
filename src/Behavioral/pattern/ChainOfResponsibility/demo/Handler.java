/**
 * 
 */
package pattern.ChainOfResponsibility.demo;

/**
 * 处理者基类
 * <p>
 * 抽象处理者角色
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-1
 */
public abstract class Handler {

	// 下一个处理者
	private Handler nextHandler;

	/**
	 * @param nextHandler
	 *            下一个处理者
	 */
	public Handler(Handler nextHandler) {
		this.nextHandler = nextHandler;
	}

	public Handler getNextHandler() {
		return nextHandler;
	}

	public void setNextHandler(Handler nextHandler) {
		this.nextHandler = nextHandler;
	}

	/**
	 * 处理请求
	 * 
	 * @param request
	 *            请求
	 */
	public abstract void handleRequest(Request request);
}