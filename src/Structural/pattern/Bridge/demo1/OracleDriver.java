/**
 * 
 */
package pattern.Bridge.demo1;

/**
 * Oracle���ݿ��������ӿ�
 * <p>
 * ConcreteImplementor��ɫ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-27
 */
public class OracleDriver implements DatabaseDriver {

	@Override
	public Object runSQL(String sql) {
		System.out.println("OracleDriver.runSQL: " + sql);
		return sql;
	}
}