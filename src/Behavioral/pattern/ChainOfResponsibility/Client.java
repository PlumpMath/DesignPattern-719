/**
 * 
 */
package pattern.ChainOfResponsibility;

/**
 * 客户端角色
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
		/*
		 * 客户端创建了两个处理者对象，
		 * 并指定第一个处理者对象的下家是第二个处理者对象 
		 * 而第二个处理者对象没有下家，
		 * 然后客户端将请求传递给第一个处理这对象。
		 */
		Handler handler1 = new ConcreteHandlerA();
		Handler handler2 = new ConcreteHandlerB();
		handler1.setNext(handler2);
		handler1.handleRequest();
	}
}