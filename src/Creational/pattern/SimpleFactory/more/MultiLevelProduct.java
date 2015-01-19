/**
 * 
 */
package pattern.SimpleFactory.more;

/**
 * 1.�༶�β�Ʒ�ṹ
 * <p>
 * ����ʵ��ϵͳ�У���Ʒ�����γɸ��ӵĵȼ��ṹ���򵥹���ģʽ��ȡ�����Բ���Ӧ���Ĳ��ԣ�һ��ʹ��ͬһ�������ࡣ
 * <p>
 * �ŵ㣺
 * ��Ƽ򵥣���Ʒ��ĵȼ��ṹ���ᷴӳ���������������Ӷ���Ʒ��ĵȼ��ṹ�ı仯Ҳ����Ӱ�쵽�����ࡣ
 * 
 * ȱ�㣺
 * �����µĲ�Ʒ�ؽ����¹�������޸ġ�
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-2-4
 */
public class MultiLevelProduct {

}

/**
 * ʹ��Shape�Ŀͻ�����
 */
class ShapeClient {

	static void consume() {
		ShapeFactory.create("Triangle");
		// ... ...
	}
}

/**
 * Shape������
 */
class ShapeFactory {

	static Shape create(String which) {
		// �����µ� Shape ʱ��Ҫ�޸�������߼�
		if (which.equalsIgnoreCase("Triangle")) {
			return new Triangle();
		} else if (which.equalsIgnoreCase("Rectangle")) {
			return new Rectangle();
		} else if (which.equalsIgnoreCase("Square")) {
			return new Square();
		}
		return null;
	}
}

/**
 * ��Ʒ��ӿ�Shape
 */
interface Shape {

}

/**
 * ������
 */
class Triangle implements Shape {

}

/**
 * �ı���
 */
abstract class Quadrangle implements Shape {

}

/**
 * ����
 */
class Rectangle extends Quadrangle {

}

/**
 * ����
 */
class Diamond extends Quadrangle {

}

/**
 * ������
 */
class Square extends Diamond {

}