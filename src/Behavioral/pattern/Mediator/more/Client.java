/**
 * 
 */
package pattern.Mediator.more;

/**
 * 客户端
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-9
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ClolleagueManager manager = new ClolleagueManager();
		manager.colleague1Action();
		manager.colleague2Action();
		manager.colleague1Changed();
		manager.colleague2Changed();
	}
}