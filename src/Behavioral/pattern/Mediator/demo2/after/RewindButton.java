/**
 * 
 */
package pattern.Mediator.demo2.after;

import java.awt.event.ActionListener;

/**
 * Rewind按钮
 * <p>
 * 具体同事对象
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-9
 */
public class RewindButton extends AbstractKeypadButton {

	private static final long serialVersionUID = 1L;

	public RewindButton(ActionListener al, Mediator mediator) {
		super(al, mediator);
		setText("Rewind");
		getMediator().setRewindButton(this);
	}

	public void execute() {
		getMediator().rewind();
	}
}