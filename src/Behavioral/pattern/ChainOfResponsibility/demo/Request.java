/**
 * 
 */
package pattern.ChainOfResponsibility.demo;

/**
 * ����ö��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-1
 */
public enum Request {

	LEAVE("���"), RAISES("��н"), PROMOTION("����"), OTHER("��������");

	private String description;// ��������

	private Request(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
}