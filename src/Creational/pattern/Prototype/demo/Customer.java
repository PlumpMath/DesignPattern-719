package pattern.Prototype.demo;

import java.util.List;

/**
 * 顾客类(客户端)
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-3-28
 */
public class Customer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 设计原型夹克
		Clothes jacket = new Jacket("black", 26);
		// 向制衣厂下订单生产5套一样的
		List<Clothes> jackets = ClothesFactory.patchCreate(jacket, 5);
		for (Clothes clothes : jackets) {
			System.out.println(clothes);
		}
		Clothes shirt = new Shirt("white", 23);
		List<Clothes> shirts = ClothesFactory.patchCreate(shirt, 5);
		for (Clothes clothes : shirts) {
			System.out.println(clothes);
		}
	}
}