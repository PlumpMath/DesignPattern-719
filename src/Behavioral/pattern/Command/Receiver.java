/**
 * 
 */
package pattern.Command;

/**
 * 接收者(Receiver)角色
 * <p>
 * 命令的接受者，在命令的控制下执行行动方法。
 * 负责具体实施和执行一个请求。任何一个类都可以成为接收者。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-4
 */
public class Receiver {

	/**
	 * 执行动作
	 */
	public void action(){
		System.out.println("action in Receiver");
	}
}