/**
 * 
 */
package pattern.SimpleFactory.more;

/**
 * 3.�����Ʒ��ɫ��ʡ��
 * <p>
 * ���ϵͳ����һ�������Ʒ��ɫ�Ļ�����ô�Ϳ���ʡ�Ե������Ʒ��ɫ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-2-4
 */
public class AbsProductOmitted {

}

/**
 * ʹ�þ����Ʒ��Ŀͻ���
 */
class ConcreteProductClient {

	@SuppressWarnings("unused")
	static void consume() {
		ConcreteProduct product = Factory.create();
	}
}

/**
 * ������
 */
class Factory {

	static ConcreteProduct create() {
		return new ConcreteProduct();
	}
}

/**
 * �����Ʒ��
 */
class ConcreteProduct {
}