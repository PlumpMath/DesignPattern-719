/**
 * 
 */
package pattern.Prototype.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * ���³�
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-3-28
 */
public class ClothesFactory {

	/**
	 * ���������·�
	 * 
	 * @param clothes
	 *            �·�ԭ��
	 * @param n
	 *            ��������
	 */
	public static List<Clothes> patchCreate(Clothes clothes, int n) {
		List<Clothes> list = new ArrayList<Clothes>();
		for (int i = 0; i < n; i++) {
			list.add(clothes.clone());
		}
		return list;
	}
}