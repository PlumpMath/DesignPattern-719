/**
 * 
 */
package pattern.AbstractFactory.demo;

/**
 * IBM电脑零件工厂
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-2-24
 */
public class IBMPartsFactory implements ComputerPartsFactory {

	public CPU produceCPU() {
		return new IBMCPU();
	}

	public RAM produceRAM() {
		return new IBMRAM();
	}
}
