/**
 * 
 */
package pattern.AbstractFactory.demo;

/**
 * ���Թ���
 * <p>
 * ����������ͻ��˳�����
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-2-24
 */
public class ComputerFactory {
	
	private static ComputerPartsFactory ibmPartsFactory = new IBMPartsFactory();
	private static ComputerPartsFactory macPartsFactory = new MacPartsFactory();

	/**
	 * ����IBM�Ƶ���
	 */
	public static Computer createIBM() {
		return create(ibmPartsFactory);
	}

	/**
	 * ����Mac�Ƶ���
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