/**
 * 
 */
package pattern.Prototype;

/**
 * 抽象原型(Prototype)角色
 * <p>
 * 这是一个抽象角色，通常由一个Java接口或抽象类实现。
 * 此角色给出了所有的具体原型类所需的接口。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-3-28
 */
public interface Prototype extends Cloneable {

	/**
	 * 返回克隆的对象实例
	 * <p>
	 * clone()的具体实现一般有三种方式，详见三个实现类
	 * <p>
	 * clone()方法满足以下的描述：
	 * 1，对任何对象x，都有：x.clone() != x。
	 * 换言之，克隆对象与原对象不是同一个对象。
	 * 2，对任何对象x，都有：x.clone().getClass() == x.getClass()。
	 * 换言之，克隆对象与原对象的类型一样。
	 * 3，如果对象x的equals()方法定义恰当的话，那么x.clone().equals(x)应当是成立的。
	 */
	public Object clone();
}