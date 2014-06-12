/**
 * 
 */
package pattern.Proxy.more;

/**
 * Զ��(Remote)������ʾ
 * <p>
 * Ϊһ��λ�ڲ�ͬ�ĵ�ַ�ռ�Ķ����ṩһ������������
 * �����ͬ�ĵ�ַ�ռ�������ڱ������У�Ҳ����������һ̨�����С�
 * <p>
 * �ŵ㣺<p>
 * ϵͳ���Խ������ϸ������������ʹ�ÿͻ��˲��ؿ�������Ĵ��ڡ�<br>
 * �ͻ���ȫ������Ϊ������Ķ����Ǿ���Ķ�����Զ�̵ģ�
 * ���������е��˴󲿷ֵ�����ͨ�Ź�����<p>
 * ȱ�㣺<p>
 * ���ڿͻ�����û����ʶ��������һ���ķ�ʱ���Զ�̵��ã���˿ͻ�û�б�Ҫ��˼��׼����
 * <p>
 * Զ�̴�����RMI��CORBA��Щ�ֲ�ʽ�������ĸ���
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-22
 */
public class RemoteProxyDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// �ͻ��˳���ֱ��ʹ��WebServiceProxy�����������ķ������˵Ķ���
		WebService service = new WebServiceProxy();
		System.out.println("message :" + service.getMessage());
	}
}

/**
 * WebService�ӿ�
 */
interface WebService {

	/**
	 * ������Ϣ
	 */
	public String getMessage();
}

/**
 * WebService�ķ�������ʵ��
 * <p>
 * ������Լ����Ķ���Ӧ�÷ֲ��ڷ�������
 */
class WebServiceImpl implements WebService {

	@Override
	public String getMessage() {
		for (int i = 0; i < 5; i++) {
			try {
				// ģ�����������ĳЩ����
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.print(".");
		}
		System.out.println();
		return "Hello Client!";
	}
}

/**
 * WebService�Ŀͻ��˴���
 * <p>
 * ������Լ����Ķ���Ӧ�÷ֲ��ڿͻ���
 */
class WebServiceProxy implements WebService {

	private WebService webService;

	public WebServiceProxy() {
		// do nothing
	}

	@Override
	public String getMessage() {
		// �����أ�ֻ�б�����ʱ�Ŵ��������ķ������
		if (webService == null) {
			webService = new WebServiceImpl();
		}
		System.out.println("send request to server......");
		String message = webService.getMessage();
		System.out.println("receive responses from server......");
		return message;
	}
}