/**
 * 
 */
package pattern.Mediator.demo2.after;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * 录音机键盘
 * <p>
 * 使用调停者模式的实现方式
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-9
 */
public class AudioPlayerKeypad  extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;

	// 调停器
	private Mediator mediator = new Mediator();

	private JLabel displayLabel;

	private JButton playButton;
	private JButton stopButton;
	private JButton rewindButton;

	public AudioPlayerKeypad() {
		super();
		initUI();
	}

	private void initUI() {
		setLayout(new BorderLayout());
		add(getDisplayLabel(), BorderLayout.NORTH);
		add(getButtonPanel(), BorderLayout.SOUTH);
	}

	private JPanel getButtonPanel() {
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER));
		panel.add(getPlayButton());
		panel.add(getStopButton());
		panel.add(getRewindButton());
		return panel;
	}

	private JLabel getDisplayLabel() {
		if (displayLabel == null) {
			displayLabel = new DisplayLabel(mediator);
		}
		return displayLabel;
	}

	private JButton getPlayButton() {
		if (playButton == null) {
			playButton = new PlayButton(this, mediator);
		}
		return playButton;
	}

	private JButton getStopButton() {
		if (stopButton == null) {
			stopButton = new StopButton(this, mediator);
		}
		return stopButton;
	}

	private JButton getRewindButton() {
		if (rewindButton == null) {
			rewindButton = new RewindButton(this, mediator);
		}
		return rewindButton;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 按键动作处理
		Command command = (Command) e.getSource();
		command.execute();
	}
}