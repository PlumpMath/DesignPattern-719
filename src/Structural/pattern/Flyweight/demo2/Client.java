/**
 * 
 */
package pattern.Flyweight.demo2;

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
		long start = runtime.totalMemory() - runtime.freeMemory();
		Student student = new Student("tom");
		Random random = new Random();
		// ���Դ���10000��ѧУ��Ϣ����Ҫ���ڴ�����
		for (int i = 0; i < 10000; i++) {
			student.setSchool(SchoolInfoPool.getInstance().create(
					"School" + random.nextInt(3) + 1, random.nextInt(6) + 1));
		}
		long end = runtime.totalMemory() - runtime.freeMemory();
		System.out.println("SchoolInfoPool memory=" + (end - start) / 1024
				+ "KB");

		start = runtime.totalMemory() - runtime.freeMemory();
		for (int i = 0; i < 10000; i++) {
			student.setSchool(SchoolInfoFactory.create(
					"School" + random.nextInt(3) + 1, random.nextInt(6) + 1));
		}
		end = runtime.totalMemory() - runtime.freeMemory();
		System.out.println("SchoolInfoFactory memory=" + (end - start) / 1024
				+ "KB");
	}
}