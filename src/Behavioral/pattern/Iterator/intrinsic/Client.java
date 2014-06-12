/**
 * 
 */
package pattern.Iterator.intrinsic;

/**
 * �ͻ���
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-5-17
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// �����ۼ����󲢶�����в���
		Aggregate<String> agg = new ConcreteAggregate<String>();
		agg.add("0");
		agg.add("1");
		agg.add("2");
		agg.add("3");
		agg.add("4");
		// �ںоۼ����޷�ʹ������ķ�ʽ���б�����
//		// ʹ��forѭ����ʽ�����ۼ�
//		System.out.println("iterate by for style");
//		for (int i = 0; i < agg.size(); i++) {
//			System.out.print(agg.get(i) + ",");
//		}
		// ʹ�õ����ӷ�ʽ�����ۼ�
		System.out.println("iterate by Iterator style");
		Iterator<String> it = agg.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + ",");
		}
	}
}