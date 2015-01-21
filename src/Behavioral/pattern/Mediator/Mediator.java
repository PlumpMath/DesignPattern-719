/**
 * 
 */
package pattern.Mediator;

/**
 * 抽象调停者角色
 * <p>
 * 定义出同事对象到调停者对象的接口，其中主要的方法是一个(或者多个)事件方法。
 * 在有些情况下，这个抽象角色可以省略。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-8
 */
public interface Mediator {

	/**
	 * 这就是所谓的事件方法，当一个同事对象的自身状态发生了变化的时候
	 * 它可以调用这个事件方法来通知调停者，从而通知所有有关的同事对象。
	 * 
	 * @param id 事件标识
	 */
	public void colleagueChanged(String id);
}