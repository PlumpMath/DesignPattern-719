package pattern.Decorator.javaio;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * InputStreamReader��ʾ��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-17
 */
public class EchoDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			System.out.println("Enter data and push enter:");
			// InputStreamReader����һ��InputStream���͵Ķ��󣬽�֮�����ΪReader����
			InputStreamReader input = new InputStreamReader(System.in);
			// ʹ��BufferedReader��װ�����������幦�ܼ���ȥ
			BufferedReader reader = new BufferedReader(input);
			// װ��ģʽ�������˻��ˣ��ͻ��˳��������װ�������еķ���
			String echo = reader.readLine();
			System.out.println("Data entered:\n" + echo);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}