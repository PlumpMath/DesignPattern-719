/**
 * 
 */
package pattern.AbstractFactory.demo;

/**
 * �����������
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-2-3
 */
public interface ComputerPartsFactory {

	/**
	 * ����CPU��ʵ��
	 */
	public CPU produceCPU();
	
	/**
	 * ����RAM��ʵ��
	 */
	public RAM produceRAM();
}