/**
 * 
 */
package pattern.Singleton.more;

/**
 * 4��ö�ٵ���
 * <p>
 * �����ܱ�����߳�ͬ�����⣬���һ��ܷ�ֹ�����л����´����µĶ���
 * ��������ʵ�ַ�ʽ������Java��������ʵ�ֵģ��������ձ��ԡ�
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2014-6-6
 */
public enum EnumSingleton {

	INSTANCE;

	private EnumSingleton() {
		System.out.println("instance created");
	}
}
