/**
 * 
 */
package pattern.Builder.demo1;

/**
 * ��ʦ��
 * <p>
 * �����߽�ɫ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-3-17
 */
public class Cook {

	private HamburgerBuilder builder;
	
	public Cook(HamburgerBuilder builder){
		this.builder = builder;
	}

	/**
	 * ��������
	 * <p>
	 * ���������Ĺ���(�����߼�)ֻ�г�ʦ(������)֪��
	 */
	public void construct(){
		// �ȷ������Ȼ����⡢�����߲�
		builder.buildBread();
		builder.buildMeat();
		builder.buildVegetable();
	}
	
	public void setBuilder(HamburgerBuilder builder) {
		this.builder = builder;
	}
}