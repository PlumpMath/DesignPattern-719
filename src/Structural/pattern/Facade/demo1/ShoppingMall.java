/**
 * 
 */
package pattern.Facade.demo1;

import pattern.Facade.demo1.JacketFactory.Jacket;
import pattern.Facade.demo1.ShirtFactory.Shirt;
import pattern.Facade.demo1.ShoeFactory.Shoe;

/**
 * ��������
 * <p>
 * ��������Factory������Facade�࣬�Թ˿��ṩͳһ�ӿ�
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-26
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
	
	// �Ժ���������µ���Ʒ������������ʱ��ֻҪ�ṩ�µĽӿڼ���
}