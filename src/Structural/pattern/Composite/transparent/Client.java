/**
 * 
 */
package pattern.Composite.transparent;

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
		// ͸��ʽ�ĺϳ�ģʽҪ�����еľ��幹���࣬������֦����������Ҷ������������һ���̶��Ľӿڡ�
		// �������Ҫ�����Ӷ��󣬿���ֱ��ʹ��Component����������
		Component root = new Composite();
		root.add(new Leaf());
		Component branch1 = new Composite();
		branch1.add(new Leaf());
		branch1.add(new Leaf());
		root.add(branch1);
		Component branch11 = new Composite();
		branch11.add(new Leaf());
		branch1.add(branch11);
		return root;
	}
	
	private static void doOperation(Component component){
		component.operation();
	}
}
