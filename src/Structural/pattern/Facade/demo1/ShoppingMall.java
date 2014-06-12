/**
 * 
 */
package pattern.Facade.demo1;

import pattern.Facade.demo1.JacketFactory.Jacket;
import pattern.Facade.demo1.ShirtFactory.Shirt;
import pattern.Facade.demo1.ShoeFactory.Shoe;

/**
 * 购物中心
 * <p>
 * 各个厂家Factory的门面Facade类，对顾客提供统一接口
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-26
 */
public class ShoppingMall {

	public ShoppingMall() {
		// do nothing
	}

	public Jacket buyJacket() {
		return JacketFactory.create();
	}

	public Shirt buyShirt() {
		return ShirtFactory.create();
	}

	public Shoe buyShoe() {
		return ShoeFactory.create();
	}
	
	// 以后会有其他新的商品会加入进来，到时候只要提供新的接口即可
}