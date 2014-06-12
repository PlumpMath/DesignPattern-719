/**
 * 
 */
package pattern.Singleton;

/**
 * ����ȫ�ĵ�����
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-3-9
 */
public class PublicConstructorSingleton {
	
	private static PublicConstructorSingleton instance;

	/**
	 * �����Ĺ��췽����������ֱ�Ӵ��������ʵ��
	 * ��Υ���˵�����ֻ��һ��ʵ�������ԣ���˲�����ȫ�ĵ�����
	 * <p>
	 * ������������ԭ��
	 * 1����ѧ�ߵĴ���
	 * 2���������ǲ��ܣ���һ������Ƴ�Ϊ�����࣬�������ִ���Ӧ���ж���һ����ʵ��
	 * ԡ�Ҿͽ����췽����Ϊ�����ģ��Ա�����Ҫ����һ����ʵ��ʱ��������ʱ���ù��췽�������µ�ʵ��
	 * 3������ʹ��һ��"����"�ĵ���ģʽ����������Ψһ�ô�������ͻ���ѡ����ν���ʵ����
	 * �����Դ����µ��Լ����е�ʵ��������ʹ�ù�����Ǹ�ʵ��
	 * ����û���κε�ǿ�ƴ�ʩ���ͻ��˵�ѡ��һ���Ǻ����ѡ��
	 * ������ǡ���Ľ�ѡ��Ȩ�����ͻ��˱�Ȼ�ᵼ�²��������ƺ�ʵ��
	 */
	public PublicConstructorSingleton() {
	}

	public synchronized static PublicConstructorSingleton getInstance() {
		if (instance == null) {
			instance = new PublicConstructorSingleton();
		}
		return instance;
	}
}