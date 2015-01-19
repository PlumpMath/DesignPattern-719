/**
 * 
 */
package pattern.Flyweight.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * ������Ԫ(UnsharableFlyweight)��ɫ
 * <p>
 * ������Ԫ��ɫ������Ķ����ǲ����Թ���ģ�����һ��������Ԫ������Էֽ��Ϊ��������ǵ�����Ԫ�������ϡ�
 * <p>
 * ������Ԫ�������ɵ�������Ԫ����ͨ�����϶��ɣ�������ṩ��add()�����ľۼ���������
 * ����һ��������Ԫ������в�ͬ�ľۼ�Ԫ�أ���Щ�ۼ�Ԫ���ڸ�����Ԫ���󱻴���֮����룬
 * �Ȿ�����ζ�Ÿ�����Ԫ�����״̬�ǻ�ı�ģ���˸�����Ԫ�����ǲ��ܹ���ġ�
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-8-2
 */
public class CompositeFlyweight extends Flyweight {

	private List<Flyweight> list;

	CompositeFlyweight() {
		this.list = new ArrayList<Flyweight>();
	}

	/**
	 * ���һ����Ԫ����
	 * 
	 * @param flyweight
	 */
	public void addFlyweight(Flyweight flyweight) {
		list.add(flyweight);
	}

	/**
	 * �������еĵ�����Ԫ���󣬽�����״̬����ȥ
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