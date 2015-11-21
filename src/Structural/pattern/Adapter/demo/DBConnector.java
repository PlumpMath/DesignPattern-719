/**
 * 
 */
package pattern.Adapter.demo;

/**
 * 数据库连接器接口
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-4
 */
public interface DBConnector {

	public void connect();

	public void disconnect();
}
