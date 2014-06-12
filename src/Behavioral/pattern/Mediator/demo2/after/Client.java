/**
 * 
 */
package pattern.Mediator.demo2.after;

import pattern.Mediator.demo2.FrameDisplayer;

/**
 * 使用调停者模式的演示
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-8
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new FrameDisplayer(new AudioPlayerKeypad());
	}
}