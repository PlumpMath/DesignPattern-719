/**
 * 
 */
package pattern.SimpleFactory.more;

/**
 * 5.������ɫȫ���ϲ�
 * <p>
 * ��������Ʒ��ɫ�Ѿ���ʡ�ԣ���������ɫ�Ϳ���������Ʒ��ɫ�ϲ�������Ʒ�౾��Ҳ�����Լ��Ĺ�����
 * �����˻��ļ򵥹���ģʽ�뵥��(����)ģʽ��Щ���ƣ�������ͬ��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-2-4
 */
public class ThreeInOne {

}

class ConProductClient {

	@SuppressWarnings("unused")
	static void consume() {
		ConProduct product = ConProduct.getInstance();
	}
}

class ConProduct {

	static ConProduct getInstance() {
		return new ConProduct();
	}
}