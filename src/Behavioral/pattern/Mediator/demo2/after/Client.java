/**
 * 
 */
package pattern.Mediator.demo2.after;

import pattern.Mediator.demo2.FrameDisplayer;

/**
 * ʹ�õ�ͣ��ģʽ����ʾ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-8
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new FrameDisplayer(new AudioPlayerKeypad());
	}
}