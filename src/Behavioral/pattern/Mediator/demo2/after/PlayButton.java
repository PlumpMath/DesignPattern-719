/**
 * 
 */
package pattern.Mediator.demo2.after;

import java.awt.event.ActionListener;

/**
 * Play��ť
 * <p>
 * ����ͬ�¶���
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-9
 */
public class PlayButton extends AbstractKeypadButton {

	private static final long serialVersionUID = 1L;

	public PlayButton(ActionListener al, Mediator mediator) {
		super(al, mediator);
		setText("Play");
		getMediator().setPlayButton(this);
	}

	public void execute() {
		getMediator().play();
	}
}