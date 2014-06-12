/**
 * 
 */
package pattern.AbstractFactory.demo;

/**
 * Mac�����������
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-2-24
 */
public class MacPartsFactory implements ComputerPartsFactory {

	public CPU produceCPU() {
		return new MacCPU();
	}

	public RAM produceRAM() {
		return new MacRAM();
	}
}