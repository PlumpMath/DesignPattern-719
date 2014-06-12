/**
 * 
 */
package pattern.Bridge.demo1;

/**
 * 应用程序
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-27
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String sql = "select * from table";
		JdbcAPI jdbcapi = new DefaultJdbcAPI(new OracleDriver());
		jdbcapi.query(sql);
		jdbcapi = new DefaultJdbcAPI(new SQLServerDriver());
		jdbcapi.query(sql);
	}
}