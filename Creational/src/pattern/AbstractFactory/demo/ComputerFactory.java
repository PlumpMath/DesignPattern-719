/**
 * 
 */
package pattern.AbstractFactory.demo;

/**
 * 电脑工厂
 * <p>
 * 即电脑零件客户端程序类
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-2-24
 */
public class ComputerFactory {
	
	private static ComputerPartsFactory ibmPartsFactory = new IBMPartsFactory();
	private static ComputerPartsFactory macPartsFactory = new MacPartsFactory();

	/**
	 * 生产IBM牌电脑
	 */
	public static Computer createIBM() {
		return create(ibmPartsFactory);
	}

	/**
	 * 生产Mac牌电脑
	 */
	public static Computer createMAC() {
		return create(macPartsFactory);
	}

	private static Computer create(ComputerPartsFactory factory) {
		CPU cpu = factory.produceCPU();
		RAM ram = factory.produceRAM();
		return new Computer(cpu, ram);
	}
}
