/**
 * 
 */
package pattern.Iterator.extrinsic;

/**
 * 聚集接口
 * <p>
 * 聚集(Aggregate)角色：此角色给出了创建迭代子对象的接口。
 * <p>
 * 这是白盒聚集的示例接口，白盒聚集向外界提供访问自己的内部元素的接口(即get()方法)，
 * 从而使外禀迭代子可以通过聚集的遍历方法实现迭代功能。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-5-17
 */
public interface Aggregate<T> {

	/**
	 * 增加一个元素
	 */
	public void add(T t);

	/**
	 * 删除指定元素
	 */
	public void remove(T t);

	/**
	 * 返回聚集元素数
	 */
	public int size();

	/**
	 * 返回指定索引处的元素
	 */
	public T get(int index);

	/**
	 * 返回一个迭代器
	 */
	public Iterator<T> iterator();
}