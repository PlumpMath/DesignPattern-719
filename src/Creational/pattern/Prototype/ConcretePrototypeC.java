/**
 * 
 */
package pattern.Prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 具体原型角色
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-3-28
 */
public class ConcretePrototypeC implements Prototype, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7665077372000987818L;

	/**
	 * 采用序列化和反序列化的方式实现克隆
	 * <p>
	 * 实际上写到流里的是对象的一个拷贝，而原对象仍然存在于JVM里。
	 * 在Java语言里深克隆一个对象，常常可以先将对象实现Serializable接口，然后把对象(实际上是它的拷贝)写到一个流中，
	 * 再从流里堵回来便可以创建对象。这样做的前提是对象以及对象内部所引用到的对象都是可以序列化的，否则，
	 * 就需要仔细考察那些不可以序列化的对象可否设成transient，从而将之排除在克隆过程之外。
	 */
	public Object clone() {
		Object object = null;
		try {
			// 将原型对象通过流写到内存中
			ByteArrayOutputStream bo = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(bo);
			oos.writeObject(this);
			// 将对象通过流从内存中读取出来
			ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
			ObjectInputStream ois = new ObjectInputStream(bi);
			object = ois.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return object;
	}
}