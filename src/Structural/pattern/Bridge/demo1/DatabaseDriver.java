/**
 * 
 */
package pattern.Bridge.demo1;

/**
 * ���ݿ��������ӿ�
 * <p>
 * Implementor��ɫ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-27
 */
public interface DatabaseDriver {

	/**
	 * ִ��SQL
	 */
	public Object runSQL(String sql);
}