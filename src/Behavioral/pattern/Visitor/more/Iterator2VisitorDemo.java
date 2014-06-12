/**
 * 
 */
package pattern.Visitor.more;

import java.util.Collection;
import java.util.Iterator;

/**
 * 从Iterator模式向Visitor模式的转变
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-21
 */
public class Iterator2VisitorDemo {
}

/**
 * 使用Iterator模式打印对象信息
 * <p>
 * 如果聚集中存放的是相同类型的对象，那么使用Iterator模式对
 * 聚集进行遍历操作时对其内对象的处理没有什么问题。
 */
class PrintUsingIterator {

	/**
	 * 对于所有的Printable对象都直接调用toString()进行打印
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
 * 使用Iterator模式根据对象类型打印其信息
 * <p>
 * 如果聚集内部保存的是一些类型不同的对象，它们紧紧有一个相同的高层接口
 * 这时候使用Iterator模式对聚集进行遍历操作时对其内对象的处理就需要进行类型判断。
 * 换言之，如果需要针对一个包含不同类型元素的聚集采取某种操作，
 * 而操作的细节根据元素的类型不同而有所不同时，就会出现必须对元素类型做类型判断的条件转移语句。
 */
class PrintUsingIterator2 {

	/**
	 * 对于不同的类型的Printable对象打印的信息也是不同的
	 */
	static void print(Collection<Printable> c) {
		Iterator<Printable> it = c.iterator();
		while (it.hasNext()) {
			Printable object = it.next();
			// 下面有众多的类型判断逻辑和条件转移语句
			if (object instanceof StringObject) {
				// 字符串对象直接打印出来，前后加单引号
				System.out.println("'" + object.toString() + "'");
			} else if (object instanceof FloatObject) {
				// 浮点数对象后面要加上F
				System.out.println(object.toString() + "F");
			} else if (object instanceof DoubleObject) {
				// 双精度数对象后面要加上D
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
 * 使用Visitor模式根据对象类型打印其信息
 * 功能和PrintUsingIterator2是一样的，但是使用了Visitor模式实现
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