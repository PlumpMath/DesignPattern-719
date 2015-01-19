/**
 * 
 */
package pattern.Prototype;

/**
 * �ͻ�(Client)��ɫ
 * <p>
 * �ͻ�������������������
 * <p>
 * ԭ��ģʽ�����ֱ�����ʽ��
 * 1������ʽ
 * 2���Ǽ���ʽ
 * �����ֱ�����ʽ������ԭ��ģʽ�Ĳ�ͬʵ�֣������������ǵ�������Ӱ����ģʽ�ṹ��ϸ�ڡ�
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-3-28
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		operation4Simple(new ConcretePrototypeA());
		operation4Simple(new ConcretePrototypeB());
		operation4Simple(new ConcretePrototypeC());
		operation4Register(PrototypeManager.getInstance().getPrototype("A"));
		operation4Register(PrototypeManager.getInstance().getPrototype("A"));
		operation4Register(PrototypeManager.getInstance().getPrototype("B"));
		operation4Register(PrototypeManager.getInstance().getPrototype("B"));
		operation4Register(PrototypeManager.getInstance().getPrototype("C"));
		operation4Register(PrototypeManager.getInstance().getPrototype("C"));
	}

	private static void operation4Simple(Prototype prototype) {
		Prototype p = (Prototype) prototype.clone();
		System.out.println("prototype address=" + prototype);
		System.out.println("cloned address=" + p);
	}

	private static void operation4Register(Prototype prototype) {
		System.out.println("address=" + prototype);
	}
}