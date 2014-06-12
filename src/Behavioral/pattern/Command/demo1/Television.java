/**
 * 
 */
package pattern.Command.demo1;

/**
 * ����
 * <p>
 * (����)������(Receiver)��ɫ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-3
 */
public class Television implements Switchable {

	@Override
	public void turnOn() {
		System.out.println("trun on the TV.");
	}

	@Override
	public void turnOff() {
		System.out.println("trun off the TV.");
	}
}