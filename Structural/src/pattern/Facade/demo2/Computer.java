/**
 * 
 */
package pattern.Facade.demo2;

/**
 * 计算机
 * <p>
 * 门面Facade角色，直接和用户打交道
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-25
 */
public class Computer {

	private CPU cpu = null;
	private Memory memory = null;
	private HardDriver hardDriver = null;

	public Computer() {
		this.cpu = new CPU();
		this.memory = new Memory();
		this.hardDriver = new HardDriver();
	}

	/**
	 * 启动计算机
	 */
	public void start() {
		cpu.freeze();
		byte[] data = hardDriver.read(HardDriver.BOOT_SECTOR,
				HardDriver.SECTOR_SIZE);
		memory.load(Memory.BOOT_ADDRESS, data);
		cpu.jump(Memory.BOOT_ADDRESS);
		cpu.execute();
	}
}
