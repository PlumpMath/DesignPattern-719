/**
 * 
 */
package pattern.Flyweight.demo1;

/**
 * 数据库连接接口
 * <p>
 * 抽象享元角色
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-8-3
 */
public interface DBConnection {

	/**
	 * 连接到指定数据库
	 */
	public void connect(String address);

	/**
	 * 释放连接
	 */
	public void release();
}