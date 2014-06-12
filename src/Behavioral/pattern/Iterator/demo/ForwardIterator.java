/**
 * 
 */
package pattern.Iterator.demo;

/**
 * 向前遍历迭代子接口
 * <p>
 * 抽象迭代子角色
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-5-14
 */
public interface ForwardIterator<E> {

	/**
	 * 判断是否还有未遍历的元素
	 */
	public boolean hasPrevious();
	
	/**
	 * 返回前一个待遍历的元素
	 */
	public E previous();
}