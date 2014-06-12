/**
 * 
 */
package pattern.Command.demo1;

/**
 * ���
 * <p>
 * (����)������(Receiver)��ɫ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-4
 */
public class Light implements Switchable {

	@Override
	public void turnOn() {
		System.out.println("turn on the light.");
	}

	@Override
	public void turnOff() {
		System.out.println("turn off the light.");
	}
}