/**
 * 
 */
package pattern.Mediator.demo2.after;

import java.awt.event.ActionListener;

import javax.swing.JButton;

/**
 * ������ť����
 * <p>
 * ����ͬ�½�ɫ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-9
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