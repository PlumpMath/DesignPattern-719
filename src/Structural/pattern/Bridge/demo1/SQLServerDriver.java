/**
 * 
 */
package pattern.Bridge.demo1;

/**
 * SQLServer数据库驱动器接口
 * <p>
 * ConcreteImplementor角色
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-27
 */
public class SQLServerDriver implements DatabaseDriver {

	@Override
	public Object runSQL(String sql) {
		System.out.println("SQLServerDriver.runSQL= " + sql);
		return sql;
	}
}