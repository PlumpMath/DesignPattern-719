/**
 * 
 */
package pattern.ChainOfResponsibility.demo1;

/**
 * �ͻ�����
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-1
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// �ͻ��˶���һ��������
		Handler chain = new DeptManager(new GeneralManager(new CEO(new Chairman())));
		// Ա�����쵼��������
		Employee tom = new Employee("tom");
		tom.request(chain, Request.LEAVE);
		// Ա�����쵼��������
		Employee peter = new Employee("peter");
		peter.request(chain, Request.RAISES);
		// Ա�����쵼��������
		Employee bob = new Employee("bob");
		bob.request(chain, Request.PROMOTION);
		// Ա�����쵼��������
		Employee ann = new Employee("ann");
		ann.request(chain, Request.OTHER);
	}
}