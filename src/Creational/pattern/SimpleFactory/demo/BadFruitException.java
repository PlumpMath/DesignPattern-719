/**
 * 
 */
package pattern.SimpleFactory.demo;

/**
 * BadFruit异常
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-2-3
 */
public class BadFruitException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7787059924325176263L;

	/**
	 * @param message
	 */
	public BadFruitException(String message) {
		super(message);
	}
}
