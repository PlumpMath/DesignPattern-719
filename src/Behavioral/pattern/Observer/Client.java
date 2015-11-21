/**
 * 
 */
package pattern.Observer;

/**
 * 客户端
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-5-10
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 客户端程序负责创建各种对象并组装起来
		ConcreteSubject subject = new ConcreteSubject();
		subject.addObserver(new ConcreteObserver());
		subject.addObserver(new ConcreteObserver());
		subject.setState("new state");
	}
}
