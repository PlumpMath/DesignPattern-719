/**
 * 
 */
package pattern.Facade.demo2;

/**
 * Ӳ������
 * <p>
 * �������ϵͳ֮һ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-25
 */
public class HardDriver {
	
	/** Ӳ�������� */
	public static final long BOOT_SECTOR = 0;
	/** ��������С */
	public static final int SECTOR_SIZE = 1024;

	/**
	 * Ӳ��������ȡ����
	 */
	public byte[] read(long lba, int size) {
		System.out.println("HardDriver.read " + lba);
		return new byte[0];
	}
}