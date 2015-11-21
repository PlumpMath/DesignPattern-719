/**
 * 
 */
package pattern.Facade.demo2;

/**
 * 用户类
 * <p>
 * 客户端角色
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-25
 */
public class User {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 客户端直接使用Facade类，避免了和CPU等直接打交道
		Computer computer = new Computer();
		computer.start();
	}
}
