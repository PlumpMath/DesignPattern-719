/**
 * 
 */
package pattern.Iterator.demo;

/**
 * 队列接口
 * <p>
 * 抽象聚集角色
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-5-14
 */
public interface IQueue<T> {

	/**
	 * 增加一个元素
	 */
	public void add(T t);

	/**
	 * 删除一个元素
	 */
	public void remove(T t);

	/**
	 * 返回元素数
	 */
	public int size();

	/**
	 * 返回一个向前遍历的迭代子
	 */
	public ForwardIterator<T> forwardIterator();

	/**
	 * 返回一个向后遍历的迭代子
	 */
	public BackwardIterator<T> backwardIterator();
}