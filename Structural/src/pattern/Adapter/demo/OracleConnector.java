/**
 * 
 */
package pattern.Adapter.demo;

/**
 * Oracle数据库连接器
 * <p>
 * 这个连接器实际上是由Oracle提供的，所以它的源码是不可以修改的
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-4
 */
public class OracleConnector {

	/**
	 * 打开数据库
	 */
	public void open(){
		System.out.println("Open Oracle Database...");
	}
	
	/**
	 * 关闭数据库
	 */
	public void close(){
		System.out.println("Close Oracle Database...");
	}
}
