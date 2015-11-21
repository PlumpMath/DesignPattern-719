/**
 * 
 */
package pattern.Bridge.demo1;

/**
 * 数据库驱动器接口
 * <p>
 * Implementor角色
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-27
 */
public interface DatabaseDriver {

	/**
	 * 执行SQL
	 */
	public Object runSQL(String sql);
}
