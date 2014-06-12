package pattern.Prototype.demo;

import java.util.List;

/**
 * �˿���(�ͻ���)
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-3-28
 */
public class Customer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// ���ԭ�ͼп�
		Clothes jacket = new Jacket("black", 26);
		// �����³��¶�������5��һ����
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