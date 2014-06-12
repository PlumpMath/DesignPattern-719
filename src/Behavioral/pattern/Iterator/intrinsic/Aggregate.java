/**
 * 
 */
package pattern.Iterator.intrinsic;

/**
 * 聚集接口
 * <p>
 * 聚集(Aggregate)角色：此角色给出了创建迭代子对象的接口。
 * <p>
 * 这是黑盒聚集的示例接口，因为它不提供获取元素的get()方法。
 * 黑盒聚集不向外界提供遍历自己的内部元素的接口(即get()方法)，
 * 因此这些元素对象只可以被聚集内部成员访问，所以迭代子类需要定义在聚集内部。
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
	 * 返回一个迭代器
	 */
	public Iterator<T> iterator();
}