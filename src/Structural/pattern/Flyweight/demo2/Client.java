/**
 * 
 */
package pattern.Flyweight.demo2;

import java.util.Random;

/**
 * 客户端
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-8-2
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
		// 测试创建10000份学校信息所需要的内存总量
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