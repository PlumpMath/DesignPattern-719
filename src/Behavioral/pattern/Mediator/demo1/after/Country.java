/**
 * 
 */
package pattern.Mediator.demo1.after;

/**
 * ����
 * <p>
 * ����ͬ�����ɫ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-8
 */
public abstract class Country {

	private WTO wto;// ��ͣ��

	public Country(WTO wto) {
		this.wto = wto;
	}

	protected WTO getWTO() {
		return wto;
	}
}