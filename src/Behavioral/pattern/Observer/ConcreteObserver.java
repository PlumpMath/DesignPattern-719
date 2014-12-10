/**
 * 
 */
package pattern.Observer;

/**
 * ����۲���(Concrete Observer)��ɫ
 * <p>
 * �洢�������״̬��ص�״̬��ʵ�ֳ���۲��߽�ɫ��Ҫ��ĸ��½ӿڣ��Ա�ʹ�����״̬�������״̬��Э����
 * �����Ҫ������۲��߽�ɫ���Ա���һ��ָ����������������á�
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-5-10
 */
public class ConcreteObserver implements Observer {

	/**
	 * �����Լ�
	 * 
	 * @see pattern.Observer.Observer#update()
	 */
	@Override
	public void update() {
		System.out.println("I'm notified.");
	}
}