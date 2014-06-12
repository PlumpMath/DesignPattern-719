/**
 * 
 */
package pattern.Bridge.demo1;

/**
 * SQLServer���ݿ��������ӿ�
 * <p>
 * ConcreteImplementor��ɫ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-27
 */
public class SQLServerDriver implements DatabaseDriver {

	@Override
	public Object runSQL(String sql) {
		System.out.println("SQLServerDriver.runSQL= " + sql);
		return sql;
	}
}