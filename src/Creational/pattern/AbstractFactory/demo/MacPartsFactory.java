/**
 * 
 */
package pattern.AbstractFactory.demo;

/**
 * Mac电脑零件工厂
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-2-24
 */
public class MacPartsFactory implements ComputerPartsFactory {

	public CPU produceCPU() {
		return new MacCPU();
	}

	public RAM produceRAM() {
		return new MacRAM();
	}
}