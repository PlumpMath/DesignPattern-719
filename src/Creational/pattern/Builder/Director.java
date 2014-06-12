/**
 * 
 */
package pattern.Builder;

/**
 * �����߽�ɫ
 * <p>
 * ���������ɫ������þ��彨���߽�ɫ�Դ�����Ʒ����
 * �����߽�ɫ��û�в�Ʒ��ľ���֪ʶ������ӵ�в�Ʒ��ľ���֪ʶ���Ǿ��彨���߽�ɫ��
 * <p>
 * �����߽�ɫ���ͻ��˴�����Ʒ�����󻮷�Ϊ�Ը�������Ľ��������ٽ���Щ����ί�ɸ����彨���߽�ɫ��
 * ���彨���߽�ɫ�������彨�칤���ģ�����ȴ��Ϊ�ͻ�����֪��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-3-16
 */
public class Director {

	private Builder builder;// ������
	
	/**
	 * @param builder ������
	 */
	public Director(Builder builder){
		this.builder = builder;
	}
	
	/**
	 * �������
	 */
	public void construct(){
		builder.buildPart1();
		builder.buildPart2();
	}
}