/**
 * 
 */
package pattern.Facade.demo1;

import pattern.Facade.demo1.JacketFactory.Jacket;
import pattern.Facade.demo1.ShirtFactory.Shirt;
import pattern.Facade.demo1.ShoeFactory.Shoe;

/**
 * 顾客类
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-26
 */
public class Customer {

	/**
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// 没使用Facade模式时客户端示例
		// 以前买东西，客户得记住所有的厂家
		Shirt shirt = ShirtFactory.create();
		Jacket jacket = JacketFactory.create();
		Shoe shoe = ShoeFactory.create();
		// 以后会有越来越多的厂家加入进来，这样顾客需要记住很多厂家信息
		
		// 使用Facade模式时客户端示例
		// 现在买东西，只需要去购物中心就可以了
		ShoppingMall mall = new ShoppingMall();
		shirt = mall.buyShirt();
		jacket = mall.buyJacket();
		shoe = mall.buyShoe();
		// 即使以后会有越来越多的厂家，顾客只要记住购物中心就行了
		// 购物中心会知道这些新加入厂家的信息，实现了顾客和厂家的解耦
	}
}
