/**
 * 
 */
package pattern.Visitor.demo2;

/**
 * �豸�ӿ�
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-20
 */
public interface Equipment {

	/**
	 * �۸�
	 */
	public double getPrice();
	
	/**
	 * ���ܷ���
	 */
	public void accept(Visitor visitor);
}