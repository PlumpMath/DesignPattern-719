/**
 * 
 */
package pattern.Composite.safe;

/**
 * �ͻ�����
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-11
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		doOperation(buildComponent());
	}

	/**
	 * �������ӵĹ���
	 */
	private static Component buildComponent() {
		// ��ȫʽ�ĺϳ�ģʽҪ�����ۼ��ķ���ֻ��������֦�������У�������������Ҷ��������
		// �������Ҫ�����Ӷ��󣬾���Ҫֱ��ʹ��Composite����������
		Composite root = new Composite();
		root.add(new Leaf());
		Composite branch1 = new Composite();
		branch1.add(new Leaf());
		branch1.add(new Leaf());
		root.add(branch1);
		Composite branch11 = new Composite();
		branch11.add(new Leaf());
		branch1.add(branch11);
		return root;
	}
	
	private static void doOperation(Component component){
		component.operation();
	}
}