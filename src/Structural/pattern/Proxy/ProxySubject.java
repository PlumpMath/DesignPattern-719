/**
 * 
 */
package pattern.Proxy;

/**
 * ��������(Proxy)��ɫ
 * <p>
 * <li>1.�ڲ����ж���ʵ��������ã��Ӷ��������κ�ʱ�������ʵ�������
 * <li>2.���������ɫ�ṩһ������ʵ�����ɫ��ͬ�Ľӿڣ��Ա�������κ�ʱ�򶼿��������ʵ���⣻
 * <li>3.���ƶ���ʵ��������ã���������Ҫ��ʱ�򴴽���ʵ�������(��ɾ����ʵ�������)��
 * <li>4.�����ɫͨ���ڽ��ͻ��˵��ô��ݸ���ʵ������֮ǰ����֮�� ��Ҫִ��ĳ�������������ǵ����ؽ����ô��ݸ���ʵ�������
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-20
 */
public class ProxySubject implements Subject {// 2 ������ 

	private Subject realSubject;// 1 ������

	public ProxySubject() {
		// do nothing
	}
	
	/**
	 * ����ģʽ���ܲ���֪�������ı�������󣬶���������һ�����������Ľӿڡ�
	 * ��ʱ���������ܹ�������������󣬱�������������ϵͳ��������ɫ��Ϊ�������Ҵ��롣
	 * ʵ�����������������ṩ���������ԡ�
	 */
	public ProxySubject(Subject realSubject) {
		this.realSubject = realSubject;
	} 

	@Override
	public void request() {
		preRequest();// 4 ������
		getRealSubject().request();
		postRequest();// 4 ������
	}

	private Subject getRealSubject() {// 3 ������
		if (realSubject == null) {
			realSubject = new RealSubject();
		}
		return realSubject;
	}

	private void preRequest() {
		System.out.println("ProxySubject.preRequest()");
	}

	private void postRequest() {
		System.out.println("ProxySubject.postRequest()");
	}
}