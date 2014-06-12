package pattern.Decorator.javaio;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * InputStreamReader演示类
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-17
 */
public class EchoDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			System.out.println("Enter data and push enter:");
			// InputStreamReader接收一个InputStream类型的对象，将之适配成为Reader类型
			InputStreamReader input = new InputStreamReader(System.in);
			// 使用BufferedReader类装饰它，将缓冲功能加上去
			BufferedReader reader = new BufferedReader(input);
			// 装饰模式在这里退化了，客户端程序调用了装饰类特有的方法
			String echo = reader.readLine();
			System.out.println("Data entered:\n" + echo);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}