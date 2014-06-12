/**
 * 
 */
package pattern.Flyweight;

/**
 * ������Ԫ(ConcreteFlyweight)��ɫ
 * <p>
 * ʵ�ֳ�����Ԫ��ɫ���涨�Ľӿڡ����������״̬�Ļ������븺��Ϊ����״̬�ṩ�洢�ռ䡣
 * ��Ԫ���������״̬�����������������Χ�����޹أ��Ӷ�ʹ����Ԫ���������ϵͳ�ڹ���ġ�
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-8-2
 */
public class ConcreteFlyweight extends Flyweight {

	// ����һ��Character���͵�����״̬��ģʽ������״̬�����Ͳ�û������
	private Character intrinsicState;

	/**
	 * ���췽���ǰ���˽�У����������ֱ�Ӵ�����Ԫ���󣬱���ͨ����Ԫ������ȡ��Ԫ����
	 */
	ConcreteFlyweight(Character intrinsicState) {
		// ����״̬��ֵӦ������Ԫ���󱻴���ʱ����
		// ���е�����״̬�ڶ��󴴽�֮�󣬾Ͳ����ٸı���
		this.intrinsicState = intrinsicState;
	}

	/**
	 * ���һ����Ԫ����������״̬�Ļ������е��ⲿ״̬������洢�ڿͻ���
	 * ��ʹ����Ԫ����ʱ�����ɿͻ��˴�����Ԫ����
	 *
	 * @see pattern.Flyweight.Flyweight#operation(java.lang.String)
	 */
	public void operation(String state) {
		System.out.print("Intrinsic State=" + intrinsicState);
		System.out.println(",Extrinsic State=" + state);
	}
}