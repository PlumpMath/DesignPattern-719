/**
 * 
 */
package pattern.AbstractFactory.demo;

/**
 * IBM�����������
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-2-24
 */
public class IBMPartsFactory implements ComputerPartsFactory {

	public CPU produceCPU() {
		return new IBMCPU();
	}

	public RAM produceRAM() {
		return new IBMRAM();
	}
}