/**
 * 
 */
package pattern.Mediator.demo2;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * ��JFrame����JPanel��չ��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-9
 */
public class FrameDisplayer extends JFrame {

	private static final long serialVersionUID = 1L;

	public FrameDisplayer(JPanel panel) {
		getContentPane().add(panel);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setSize(400, 200);
		setVisible(true);
	}
}