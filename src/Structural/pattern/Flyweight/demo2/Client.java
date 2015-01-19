/**
 * 
 */
package pattern.Flyweight.demo2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * �ͻ���
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-8-2
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Runtime runtime = Runtime.getRuntime();
		
		List<SchoolInfo> si = new ArrayList<SchoolInfo>();
		Random random = new Random();
		
		// ���Դ���10000��ѧУ��Ϣ����Ҫ���ڴ���������Ԫģʽ���Ը���ʡ�ڴ�
		
		long start = runtime.freeMemory();
		for (int i = 0; i < 10000; i++) {
			si.add(SchoolInfoPool.getInstance().create(
					"School" + random.nextInt(3) + 1, random.nextInt(6) + 1));
		}
		long end = runtime.freeMemory();
		System.out.println("SchoolInfoPool memory=" + (start - end) / 1024
				+ "KB");

		start = runtime.freeMemory();
		for (int i = 0; i < 10000; i++) {
			si.add(SchoolInfoFactory.create(
					"School" + random.nextInt(3) + 1, random.nextInt(6) + 1));
		}
		end = runtime.freeMemory();
		System.out.println("SchoolInfoFactory memory=" + (start - end) / 1024
				+ "KB");
	}
}