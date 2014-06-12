/**
 * 
 */
package pattern.Visitor.more;

import java.util.Collection;
import java.util.Iterator;

/**
 * ��Iteratorģʽ��Visitorģʽ��ת��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-21
 */
public class Iterator2VisitorDemo {
}

/**
 * ʹ��Iteratorģʽ��ӡ������Ϣ
 * <p>
 * ����ۼ��д�ŵ�����ͬ���͵Ķ�����ôʹ��Iteratorģʽ��
 * �ۼ����б�������ʱ�����ڶ���Ĵ���û��ʲô���⡣
 */
class PrintUsingIterator {

	/**
	 * �������е�Printable����ֱ�ӵ���toString()���д�ӡ
	 */
	static void print(Collection<Printable> c) {
		Iterator<Printable> it = c.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().toString());
		}
	}

	private static interface Printable {
	}
}

/**
 * ʹ��Iteratorģʽ���ݶ������ʹ�ӡ����Ϣ
 * <p>
 * ����ۼ��ڲ��������һЩ���Ͳ�ͬ�Ķ������ǽ�����һ����ͬ�ĸ߲�ӿ�
 * ��ʱ��ʹ��Iteratorģʽ�Ծۼ����б�������ʱ�����ڶ���Ĵ������Ҫ���������жϡ�
 * ����֮�������Ҫ���һ��������ͬ����Ԫ�صľۼ���ȡĳ�ֲ�����
 * ��������ϸ�ڸ���Ԫ�ص����Ͳ�ͬ��������ͬʱ���ͻ���ֱ����Ԫ�������������жϵ�����ת����䡣
 */
class PrintUsingIterator2 {

	/**
	 * ���ڲ�ͬ�����͵�Printable�����ӡ����ϢҲ�ǲ�ͬ��
	 */
	static void print(Collection<Printable> c) {
		Iterator<Printable> it = c.iterator();
		while (it.hasNext()) {
			Printable object = it.next();
			// �������ڶ�������ж��߼�������ת�����
			if (object instanceof StringObject) {
				// �ַ�������ֱ�Ӵ�ӡ������ǰ��ӵ�����
				System.out.println("'" + object.toString() + "'");
			} else if (object instanceof FloatObject) {
				// �������������Ҫ����F
				System.out.println(object.toString() + "F");
			} else if (object instanceof DoubleObject) {
				// ˫�������������Ҫ����D
				System.out.println(object.toString() + "D");
			} else {
				System.out.println(object.toString());
			}
		}
	}

	private static interface Printable {
	}

	private static class StringObject implements Printable {
	}

	private static class FloatObject implements Printable {
	}

	private static class DoubleObject implements Printable {
	}
}

/**
 * ʹ��Visitorģʽ���ݶ������ʹ�ӡ����Ϣ
 * ���ܺ�PrintUsingIterator2��һ���ģ�����ʹ����Visitorģʽʵ��
 */
class PrintUsingVisitor {

	static void print(Collection<Printable> c) {
		Iterator<Printable> it = c.iterator();
		while (it.hasNext()) {
			Printable object = it.next();
			object.accept(new MyVisitor());
		}
	}

	private static interface Printable {

		public void accept(Visitor visitor);
	}

	private static interface Visitor {

		public void visitString(StringObject string);

		public void visitFloat(FloatObject floatObject);

		public void visitDouble(DoubleObject doubleObject);
	}

	private static class MyVisitor implements Visitor {

		@Override
		public void visitDouble(DoubleObject doubleObject) {
			System.out.println(doubleObject.toString() + "D");
		}

		@Override
		public void visitFloat(FloatObject floatObject) {
			System.out.println(floatObject.toString() + "F");
		}

		@Override
		public void visitString(StringObject string) {
			System.out.println("'" + string.toString() + "'");
		}
	}

	private static class StringObject implements Printable {

		@Override
		public void accept(Visitor visitor) {
			visitor.visitString(this);
		}

	}

	private static class FloatObject implements Printable {

		@Override
		public void accept(Visitor visitor) {
			visitor.visitFloat(this);
		}

	}

	private static class DoubleObject implements Printable {

		@Override
		public void accept(Visitor visitor) {
			visitor.visitDouble(this);
		}
	}
}