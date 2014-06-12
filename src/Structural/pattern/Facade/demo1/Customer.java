/**
 * 
 */
package pattern.Facade.demo1;

import pattern.Facade.demo1.JacketFactory.Jacket;
import pattern.Facade.demo1.ShirtFactory.Shirt;
import pattern.Facade.demo1.ShoeFactory.Shoe;

/**
 * �˿���
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-26
 */
public class Customer {

	/**
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// ûʹ��Facadeģʽʱ�ͻ���ʾ��
		// ��ǰ�������ͻ��ü�ס���еĳ���
		Shirt shirt = ShirtFactory.create();
		Jacket jacket = JacketFactory.create();
		Shoe shoe = ShoeFactory.create();
		// �Ժ����Խ��Խ��ĳ��Ҽ�������������˿���Ҫ��ס�ܶ೧����Ϣ
		
		// ʹ��Facadeģʽʱ�ͻ���ʾ��
		// ����������ֻ��Ҫȥ�������ľͿ�����
		ShoppingMall mall = new ShoppingMall();
		shirt = mall.buyShirt();
		jacket = mall.buyJacket();
		shoe = mall.buyShoe();
		// ��ʹ�Ժ����Խ��Խ��ĳ��ң��˿�ֻҪ��ס�������ľ�����
		// �������Ļ�֪����Щ�¼��볧�ҵ���Ϣ��ʵ���˹˿ͺͳ��ҵĽ���
	}
}