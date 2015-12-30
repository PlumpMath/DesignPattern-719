/**
 * 
 */
package pattern.Bridge.demo1;

/**
 * 应用程序使用的数据库API接口
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-27
 */
public interface JdbcAPI {

	/**
	 * 执行插入SQL
	 */
	public void insert(String sql);

	/**
	 * 执行更新SQL
	 */
	public void update(String sql);

	/**
	 * 执行删除SQL
	 */
	public void delete(String sql);

	/**
	 * 执行查询SQL
	 */
	public Object query(String sql);
}
