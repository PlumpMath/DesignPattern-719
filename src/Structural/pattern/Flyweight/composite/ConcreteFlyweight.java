/**
 * 
 */
package pattern.Flyweight.composite;

/**
 * 具体享元(ConcreteFlyweight)角色
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-8-2
 */
public class ConcreteFlyweight extends Flyweight {

	private Character intrinsicState;

	ConcreteFlyweight(Character intrinsicState) {
		this.intrinsicState = intrinsicState;
	}

	public void operation(String state) {
		System.out.print("Intrinsic State=" + intrinsicState);
		System.out.println(",Extrinsic State=" + state);
	}
}