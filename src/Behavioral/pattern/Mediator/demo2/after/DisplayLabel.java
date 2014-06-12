/**
 * 
 */
package pattern.Mediator.demo2.after;

import java.awt.Font;

import javax.swing.JLabel;

/**
 * ��ʾ��
 * <p>
 * ����ͬ�¶���
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-9
 */
public class DisplayLabel extends JLabel {

	private static final long serialVersionUID = 1L;

	public DisplayLabel(Mediator mediator) {
		super("Just start...");
		mediator.setDisplayLabel(this);
		setFont(new Font("����", Font.BOLD, 22));
	}
}