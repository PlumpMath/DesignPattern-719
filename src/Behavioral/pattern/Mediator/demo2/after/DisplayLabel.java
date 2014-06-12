/**
 * 
 */
package pattern.Mediator.demo2.after;

import java.awt.Font;

import javax.swing.JLabel;

/**
 * 显示屏
 * <p>
 * 具体同事对象
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-9
 */
public class DisplayLabel extends JLabel {

	private static final long serialVersionUID = 1L;

	public DisplayLabel(Mediator mediator) {
		super("Just start...");
		mediator.setDisplayLabel(this);
		setFont(new Font("黑体", Font.BOLD, 22));
	}
}