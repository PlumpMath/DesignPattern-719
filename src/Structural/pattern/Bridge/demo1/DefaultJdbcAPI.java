/**
 * 
 */
package pattern.Bridge.demo1;

/**
 * Ӧ�ó���Ĭ��ʹ�õ����ݿ�API
 * <p>
 * RefinedAbstraction��ɫ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-27
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