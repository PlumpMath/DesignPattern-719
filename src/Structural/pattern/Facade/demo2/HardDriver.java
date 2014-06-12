/**
 * 
 */
package pattern.Facade.demo2;

/**
 * 硬盘驱动
 * <p>
 * 计算机子系统之一
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-25
 */
public class HardDriver {
	
	/** 硬盘启动区 */
	public static final long BOOT_SECTOR = 0;
	/** 启动区大小 */
	public static final int SECTOR_SIZE = 1024;

	/**
	 * 硬盘驱动读取数据
	 */
	public byte[] read(long lba, int size) {
		System.out.println("HardDriver.read " + lba);
		return new byte[0];
	}
}