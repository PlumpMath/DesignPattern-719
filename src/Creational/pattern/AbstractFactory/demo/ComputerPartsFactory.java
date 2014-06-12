/**
 * 
 */
package pattern.AbstractFactory.demo;

/**
 * 电脑零件工厂
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-2-3
 */
public interface ComputerPartsFactory {

	/**
	 * 创建CPU的实例
	 */
	public CPU produceCPU();
	
	/**
	 * 创建RAM的实例
	 */
	public RAM produceRAM();
}