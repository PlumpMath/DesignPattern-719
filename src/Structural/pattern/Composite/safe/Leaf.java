/**
 * 
 */
package pattern.Composite.safe;

/**
 * 树叶构件(Leaf)角色
 * <p>
 * 树叶对象是没有下级子对象的对象，定义出参加组合的原始对象的行为。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-11
 */
public class Leaf implements Component {

	@Override
	public void operation() {
		System.out.println("Leaf operation.");
	}
}