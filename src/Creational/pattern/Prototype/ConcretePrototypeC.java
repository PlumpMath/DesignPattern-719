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
 * ����ԭ�ͽ�ɫ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-3-28
 */
public class ConcretePrototypeC implements Prototype, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7665077372000987818L;

	/**
	 * �������л��ͷ����л��ķ�ʽʵ�ֿ�¡
	 * <p>
	 * ʵ����д��������Ƕ����һ����������ԭ������Ȼ������JVM�
	 * ��Java���������¡һ�����󣬳��������Ƚ�����ʵ��Serializable�ӿڣ�Ȼ��Ѷ���(ʵ���������Ŀ���)д��һ�����У�
	 * �ٴ�����»�������Դ���������������ǰ���Ƕ����Լ������ڲ������õ��Ķ����ǿ������л��ģ�����
	 * ����Ҫ��ϸ������Щ���������л��Ķ���ɷ����transient���Ӷ���֮�ų��ڿ�¡����֮�⡣
	 */
	public Object clone() {
		Object object = null;
		try {
			// ��ԭ�Ͷ���ͨ����д���ڴ���
			ByteArrayOutputStream bo = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(bo);
			oos.writeObject(this);
			// ������ͨ�������ڴ��ж�ȡ����
			ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
			ObjectInputStream ois = new ObjectInputStream(bi);
			object = ois.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return object;
	}
}