/**
 * 
 */
package pattern.Flyweight.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 复合享元(UnsharableFlyweight)角色
 * <p>
 * 复合享元角色所代表的对象是不可以共享的，但是一个复合享元对象可以分解成为多个本身是单纯享元对象的组合。
 * <p>
 * 复合享元对象是由单纯的享元对象通过复合而成，因此它提供了add()这样的聚集管理方法。
 * 由于一个复合享元对象具有不同的聚集元素，这些聚集元素在复合享元对象被创建之后加入，
 * 这本身就意味着复合享元对象的状态是会改变的，因此复合享元对象是不能共享的。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-8-2
 */
public class CompositeFlyweight extends Flyweight {

	private List<Flyweight> list;

	CompositeFlyweight() {
		this.list = new ArrayList<Flyweight>();
	}

	/**
	 * 添加一个享元对象
	 * 
	 * @param flyweight
	 */
	public void addFlyweight(Flyweight flyweight) {
		list.add(flyweight);
	}

	/**
	 * 遍历所有的单纯享元对象，将外蕴状态传进去
	 *
	 * @see pattern.Flyweight.composite.Flyweight#operation(java.lang.String)
	 */
	@Override
	public void operation(String state) {
		for (Flyweight flyweight : list) {
			flyweight.operation(state);
		}
	}
}
