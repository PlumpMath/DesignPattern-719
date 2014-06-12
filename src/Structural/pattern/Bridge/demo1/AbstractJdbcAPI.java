/**
 * 
 */
package pattern.Bridge.demo1;

/**
 * Ӧ�ó���ʹ�õ����ݿ�API�������
 * <p>
 * Abstraction��ɫ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-27
 */
public abstract class AbstractJdbcAPI implements JdbcAPI {

	private DatabaseDriver driver;// ���ݿ�����

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