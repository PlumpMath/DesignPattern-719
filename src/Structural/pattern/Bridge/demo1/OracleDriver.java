/**
 * 
 */
package pattern.Bridge.demo1;

/**
 * Oracle数据库驱动器接口
 * <p>
 * ConcreteImplementor角色
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-27
 */
public class OracleDriver implements DatabaseDriver {

	@Override
	public Object runSQL(String sql) {
		System.out.println("OracleDriver.runSQL: " + sql);
		return sql;
	}
}