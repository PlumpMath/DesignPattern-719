/**
 * 
 */
package pattern.Mediator.more;

/**
 * 调停者接口
 * <p>
 * 3，是否使用抽象调停者
 * 如果非常肯定具体调停者角色只有一个的话，可以省略抽象调停者类。
 * 如果同时存在多个具体调停者角色的话，
 * 就有可能会在这些具体调停者角色中发现共同的代码。
 * 这样就需要一个共同的类型，并将重复的代码移动到超类中去。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-9
 */
public interface Mediator {

	/**
	 * 同事对象状态变化
	 * 
	 * @param clolleague
	 *            同事对象
	 */
	public void colleagueChanged(Colleague clolleague);
}