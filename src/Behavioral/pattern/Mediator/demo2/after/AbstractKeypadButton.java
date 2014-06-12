/**
 * 
 */
package pattern.Mediator.demo2.after;

import java.awt.event.ActionListener;

import javax.swing.JButton;

/**
 * 按键按钮基类
 * <p>
 * 抽象同事角色
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-9
 */
public abstract class AbstractKeypadButton extends JButton implements Command {

	private static final long serialVersionUID = 1L;

	private Mediator mediator;

	public AbstractKeypadButton(ActionListener al, Mediator mediator) {
		super();
		this.mediator = mediator;
		addActionListener(al);
	}

	protected Mediator getMediator() {
		return mediator;
	}
}