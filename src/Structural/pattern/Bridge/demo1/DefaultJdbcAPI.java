/**
 * 
 */
package pattern.Bridge.demo1;

/**
 * 应用程序默认使用的数据库API
 * <p>
 * RefinedAbstraction角色
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-27
 */
public class DefaultJdbcAPI extends AbstractJdbcAPI {

	public DefaultJdbcAPI(DatabaseDriver driver) {
		super(driver);
	}

	public void insert(String sql) {
		System.out.println("DefaultJdbcAPI.insert()");
		getDriver().runSQL(sql);
	}

	public void update(String sql) {
		System.out.println("DefaultJdbcAPI.update()");
		getDriver().runSQL(sql);
	}

	public void delete(String sql) {
		System.out.println("DefaultJdbcAPI.delete()");
		getDriver().runSQL(sql);
	}

	public Object query(String sql) {
		System.out.println("DefaultJdbcAPI.query()");
		return getDriver().runSQL(sql);
	}
}