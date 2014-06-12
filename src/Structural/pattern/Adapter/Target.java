/**
 * 
 */
package pattern.Adapter;

/**
 * 目标角色
 * <p>
 * 这就是客户端所期待得到的接口
 * <p>
 * 对于类的适配器模式来说，该角色只能是接口
 * 对于对象的适配器模式来说，该角色可以是接口或者类
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-4
 */
public interface Target {

	public void operation1();

	public void operation2();
}