/**
 * 
 */
package pattern.Proxy.more;

/**
 * 虚拟(Virtual)代理演示
 * <p>
 * 根据需要创建一个资源消耗较大的对象，使得此对象只在需要时才会被真正创建。
 * <p>
 * 优点：<p>
 * 代理对象可以在必要的时候才将被代理的对象加载，可以对加载的过程加以必要的优化。<br>
 * 当一个模块的加载十分耗费资源的时候，虚拟代理的优点就非常明显。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-22
 */
public class VirtualProxyDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 客户端程序直接使用PrinterProxy
		IPrinter service = new PrinterProxy();
		System.out.println("Now printing something by Printer.");
		service.print("Hello world.");
	}
}

/**
 * 打印机接口
 */
interface IPrinter {

	/**
	 * 打印
	 */
	public void print(String s);
}

/**
 * 真正的打印机
 */
class Printer implements IPrinter {

	/**
	 * 打印机对象的创建过程是很复杂并且耗时的
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
 * 打印机的代理类
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
	 * 懒加载的方式创建打印机对象，使得只有真正使用其打印时才会创建
	 */
	private Printer getPrinter() {
		if(printer == null) {
			printer = new Printer();
		}
		return printer;
	}
}