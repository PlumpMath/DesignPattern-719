/**
 * 
 */
package pattern.DefaultAdapter;

/**
 * 具体实现类3
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-5
 */
public class ConcreteService3 extends ServiceAdapter {

	/**
	 * 本类只对该方法感兴趣，所以只实现该方法
	 */
	public void operation3() {
		System.out.println("ConcreteService3");
	}
}