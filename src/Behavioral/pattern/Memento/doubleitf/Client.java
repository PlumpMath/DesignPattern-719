/**
 * 
 */
package pattern.Memento.doubleitf;

/**
 * �ͻ���
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-7-15
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		User user = new User();
		user.operation();
		Other other = new Other();
		other.setNarrow(user.getNarrow());
		other.operation();
	}
}