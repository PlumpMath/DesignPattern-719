/**
 * 
 */
package pattern.Facade.demo2;

/**
 * 内存
 * <p>
 * 计算机子系统之一
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-25
 */
public class Memory {

	// 内存启动地址
	public static final long BOOT_ADDRESS = 0;
	
	/**
	 * 内存加载数据
	 */
	public void load(long position, byte[] data) {
		System.out.println("Memory.load " + position);
	}
}
