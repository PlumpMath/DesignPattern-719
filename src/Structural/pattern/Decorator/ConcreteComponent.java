/**
 * 
 */
package pattern.Decorator;

/**
 * 具体构件角色
 * <p>
 * 定义一个将要接受附加责任的类。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-13
 */
public class ConcreteComponent implements Component {

	@Override
	public void operation() {
		System.out.println("operation in ConcreteComponent.");
	}
}