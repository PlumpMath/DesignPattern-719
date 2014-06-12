/**
 * 
 */
package pattern.Bridge.demo1;

/**
 * 应用程序使用的数据库API抽象基类
 * <p>
 * Abstraction角色
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-27
 */
public abstract class AbstractJdbcAPI implements JdbcAPI {

	private DatabaseDriver driver;// 数据库驱动

	public AbstractJdbcAPI(DatabaseDriver driver) {
		this.driver = driver;
	}

	public DatabaseDriver getDriver() {
		return driver;
	}

	public void setDriver(DatabaseDriver driver) {
		this.driver = driver;
	}

	public void insert(String sql) {
		getDriver().runSQL(sql);
	}

	public void update(String sql) {
		getDriver().runSQL(sql);
	}

	public void delete(String sql) {
		getDriver().runSQL(sql);
	}

	public Object query(String sql) {
		return getDriver().runSQL(sql);
	}
}