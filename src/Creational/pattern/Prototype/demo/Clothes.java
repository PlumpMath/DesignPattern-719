/**
 * 
 */
package pattern.Prototype.demo;

/**
 * 衣服接口
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-3-28
 */
public interface Clothes extends Cloneable {

	/**
	 * 颜色
	 */
	public String getColor();
	
	/**
	 * 尺寸
	 */
	public int getSize();
	
	/**
	 * 克隆
	 */
	public Clothes clone();
}
