/**
 * 
 */
package pattern.Mediator.demo2.after;

import java.awt.event.ActionListener;

/**
 * Stop��ť
 * <p>
 * ����ͬ�¶���
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-9
 */
public class StopButton extends AbstractKeypadButton {

	private static final long serialVersionUID = 1L;

	public StopButton(ActionListener al, Mediator mediator) {
		super(al, mediator);
		setText("Stop");
		getMediator().setStopButton(this);
	}

	public void execute() {
		getMediator().stop();
	}
}
