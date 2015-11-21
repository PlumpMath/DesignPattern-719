/**
 * 
 */
package pattern.Iterator.intrinsic;

/**
 * 迭代子
 * <p>
 * 抽象迭代子(Iterator)角色：此角色定义出遍历元素所需的接口。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-5-17
 */
public interface Iterator<E> {

	/**
	 * 是否还有未遍历的元素
	 */
	public boolean hasNext();
	
	/**
	 * 返回下一个元素
	 */
	public E next();
}
