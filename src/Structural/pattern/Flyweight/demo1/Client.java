/**
 * 
 */
package pattern.Flyweight.demo1;

/**
 * 客户端类
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-8-3
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DBConnectionPool pool = DBConnectionPool.getInstance();
		DBConnection c1 = pool.createConnection();
		c1.connect("oracle");
		DBConnection c2 = pool.createConnection();
		c2.connect("db2");
		DBConnection c3 = pool.createConnection();
		c3.connect("sqlserver");
		try {
			DBConnection c4 = pool.createConnection();
			c4.connect("mysql");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		c1.release();
		DBConnection c5 = pool.createConnection();
		c5.connect("infomix");
	}
}