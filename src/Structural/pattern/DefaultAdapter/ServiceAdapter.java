/**
 * 
 */
package pattern.DefaultAdapter;

/**
 * ȱʡ������
 * <p>
 * ������������ServiceAdapterΪService�ӿڵ����������ṩ��ƽӹ��ʵ�֣�����κμ̳���
 * ��������ľ����඼����ѡ��������Ҫ�ķ���ʵ�֣���������������Ĳ���Ҫ�ķ�����
 * <p>
 * ȱʡ����ģʽ��������һ��ȱʡ�����࣬�����Ӧ���ǳ����ࡣ��Ϊ����಻Ӧ��ʵ������ʵ������Ҳû���κ��ô���
 * ���Ǹ���Ӧ��ʵ�ֽӿ��е����з����������ǳ���ķ���������ģʽ�����⣬��Щ����֮���Դ��ھ���Ϊ���ṩĬ��ʵ�֣�
 * �Ա�ȱʡ��������ľ���������԰�����Ҫֻʵ�ָ���Ȥ�ķ��������Բ�����Ȥ�ķ�����
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-5
 */
public abstract class ServiceAdapter implements Service {

	public int operation1() {
		return 0;
	}

	public String operation2() {
		return null;
	}

	public void operation3() {
	}
}