/**
 * 
 */
package pattern.Decorator;

/**
 * ���幹����ɫ
 * <p>
 * ����һ����Ҫ���ܸ������ε��ࡣ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-13
 */
public class ConcreteComponent implements Component {

	@Override
	public void operation() {
		System.out.println("operation in ConcreteComponent.");
	}
}