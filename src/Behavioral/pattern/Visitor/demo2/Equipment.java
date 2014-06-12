/**
 * 
 */
package pattern.Visitor.demo2;

/**
 * 设备接口
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-20
 */
public interface Equipment {

	/**
	 * 价格
	 */
	public double getPrice();
	
	/**
	 * 接受方法
	 */
	public void accept(Visitor visitor);
}