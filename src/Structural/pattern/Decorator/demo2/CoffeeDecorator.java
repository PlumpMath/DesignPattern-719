/**
 * 
 */
package pattern.Decorator.demo2;

/**
 * ����װ��������
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-12
 */
public abstract class CoffeeDecorator implements Coffee {

	// ��װ�εĿ���
	protected Coffee coffee;
	
	public CoffeeDecorator(Coffee coffee) {
		this.coffee = coffee;
	}
}