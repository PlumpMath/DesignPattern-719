/**
 * 
 */
package pattern.AbstractFactory.demo;

/**
 * ������
 * <p>
 * ��Ϊʾ��������ֻ�����������CPU��RAM
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-3-3
 */
public class Computer {

	private CPU cpu;
	private RAM ram;
	
	public Computer(CPU cpu,RAM ram){
		this.cpu = cpu;
		this.ram = ram;
	}

	public CPU getCPU() {
		return cpu;
	}

	public RAM getRAM() {
		return ram;
	}
}