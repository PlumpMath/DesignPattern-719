/**
 * 
 */
package pattern.Mediator.demo1.after;

/**
 * 国家
 * <p>
 * 抽象同事类角色
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-8
 */
public abstract class Country {

	private WTO wto;// 调停者

	public Country(WTO wto) {
		this.wto = wto;
	}

	protected WTO getWTO() {
		return wto;
	}
}