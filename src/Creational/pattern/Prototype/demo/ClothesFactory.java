/**
 * 
 */
package pattern.Prototype.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * 制衣厂
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-3-28
 */
public class ClothesFactory {

	/**
	 * 批量生产衣服
	 * 
	 * @param clothes
	 *            衣服原型
	 * @param n
	 *            批量总数
	 */
	public static List<Clothes> patchCreate(Clothes clothes, int n) {
		List<Clothes> list = new ArrayList<Clothes>();
		for (int i = 0; i < n; i++) {
			list.add(clothes.clone());
		}
		return list;
	}
}