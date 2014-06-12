/**
 * 
 */
package pattern.Facade;

/**
 * 使用门面模式时的客户端
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-25
 */
public class ClientUsingFacade {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Facade.getInstance().operationAll();
	}
}