/**
 * 
 */
package pattern.Facade.demo2;

/**
 * �ڴ�
 * <p>
 * �������ϵͳ֮һ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-25
 */
public class Memory {

	// �ڴ�������ַ
	public static final long BOOT_ADDRESS = 0;
	
	/**
	 * �ڴ��������
	 */
	public void load(long position, byte[] data) {
		System.out.println("Memory.load " + position);
	}
}