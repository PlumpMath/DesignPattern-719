/**
 * 
 */
package pattern.Bridge.demo1;

/**
 * Ӧ�ó���ʹ�õ����ݿ�API�ӿ�
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-27
 */
public interface JdbcAPI {

	/**
	 * ִ�в���SQL
	 */
	public void insert(String sql);

	/**
	 * ִ�и���SQL
	 */
	public void update(String sql);

	/**
	 * ִ��ɾ��SQL
	 */
	public void delete(String sql);

	/**
	 * ִ�в�ѯSQL
	 */
	public Object query(String sql);
}