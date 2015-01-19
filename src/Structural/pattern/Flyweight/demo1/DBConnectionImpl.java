/**
 * 
 */
package pattern.Flyweight.demo1;

/**
 * ���ݿ�����ʵ����
 * <p>
 * ������Ԫ����
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-8-3
 */
public class DBConnectionImpl implements DBConnection {

	private int no;// ���

	private boolean isInUse;// �Ƿ�����ʹ��

	DBConnectionImpl(int no) {
		this.no = no;
	}

	@Override
	public void connect(String address) {
		System.out.println("connection " + no + " connects " + address + " ...");
		this.isInUse = true;
	}

	@Override
	public void release() {
		System.out.println("connection " + no + " released.");
		this.isInUse = false;
	}

	public boolean isInUse() {
		return isInUse;
	}
}