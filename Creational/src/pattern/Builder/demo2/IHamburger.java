/**
 * 
 */
package pattern.Builder.demo2;

/**
 * Hamburger接口
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-3-17
 */
public interface IHamburger {

	/**
	 * 返回面包
	 */
	public String getBread();
	
	/**
	 * 返回肉
	 */
	public String getMeat();
	
	/**
	 * 返回蔬菜
	 */
	public String getVegetable();
}
