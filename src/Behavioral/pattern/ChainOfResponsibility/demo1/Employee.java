/**
 * 
 */
package pattern.ChainOfResponsibility.demo1;

/**
 * Ա��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-1
 */
public class Employee {

	private String name;// Ա������

	public Employee(String name) {
		this.name = name;
	}

	/**
	 * ���쵼��������
	 * 
	 * @param handler
	 *            �쵼
	 * @param request
	 *            ����
	 */
	public void request(Handler handler, Request request) {
		System.out.println("Ա�� " + name + " ���� " + request.getDescription());
		handler.handleRequest(request);
		System.out.println();
	}
}