/**
 * 
 */
package pattern.FactoryMethod.demo;

/**
 * 水果接口
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-2-3
 */
public interface Fruit {

	/**
	 * 种植 
	 */
	public void plant();
	
	/**
	 * 生长
	 */
	public void grow();
	
	/**
	 * 收获
	 */
	public void harvest();
}