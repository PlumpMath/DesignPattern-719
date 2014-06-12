/**
 * 
 */
package pattern.Proxy.more;

/**
 * ����(Virtual)������ʾ
 * <p>
 * ������Ҫ����һ����Դ���Ľϴ�Ķ���ʹ�ô˶���ֻ����Ҫʱ�Żᱻ����������
 * <p>
 * �ŵ㣺<p>
 * �����������ڱ�Ҫ��ʱ��Ž�������Ķ�����أ����ԶԼ��صĹ��̼��Ա�Ҫ���Ż���<br>
 * ��һ��ģ��ļ���ʮ�ֺķ���Դ��ʱ�����������ŵ�ͷǳ����ԡ�
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-22
 */
public class VirtualProxyDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// �ͻ��˳���ֱ��ʹ��PrinterProxy
		IPrinter service = new PrinterProxy();
		System.out.println("Now printing something by Printer.");
		service.print("Hello world.");
	}
}

/**
 * ��ӡ���ӿ�
 */
interface IPrinter {

	/**
	 * ��ӡ
	 */
	public void print(String s);
}

/**
 * �����Ĵ�ӡ��
 */
class Printer implements IPrinter {

	/**
	 * ��ӡ������Ĵ��������Ǻܸ��Ӳ��Һ�ʱ��
	 */
	public Printer() {
		System.out.print("Printer initializing");
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.print(".");
		}
		System.out.println("Printer initialized");
	}

	public void print(String s) {
		System.out.println(s);
	}
}

/**
 * ��ӡ���Ĵ�����
 */
class PrinterProxy implements IPrinter {

	private Printer printer;

	public PrinterProxy() {
		// do nothing
	}

	public void print(String s) {
		getPrinter().print(s);
	}

	/**
	 * �����صķ�ʽ������ӡ������ʹ��ֻ������ʹ�����ӡʱ�Żᴴ��
	 */
	private Printer getPrinter() {
		if(printer == null) {
			printer = new Printer();
		}
		return printer;
	}
}