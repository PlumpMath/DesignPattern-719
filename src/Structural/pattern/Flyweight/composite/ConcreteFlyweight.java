/**
 * 
 */
package pattern.Flyweight.composite;

/**
 * ������Ԫ(ConcreteFlyweight)��ɫ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-8-2
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