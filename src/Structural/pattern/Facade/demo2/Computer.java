/**
 * 
 */
package pattern.Facade.demo2;

/**
 * �����
 * <p>
 * ����Facade��ɫ��ֱ�Ӻ��û��򽻵�
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-25
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
	 * ���������
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