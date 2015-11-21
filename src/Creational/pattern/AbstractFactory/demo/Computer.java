/**
 * 
 */
package pattern.AbstractFactory.demo;

/**
 * 电脑类
 * <p>
 * 作为示例，电脑只有两个零件：CPU和RAM
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-3-3
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
