/**
 * 
 */
package pattern.Mediator.demo2;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * 录音机键盘
 * <p>
 * 没有使用调停者模式的传统实现方式
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-9
 */
public class AudioPlayerKeypad extends JPanel {

	private static final long serialVersionUID = 1L;

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
			displayLabel = new JLabel();
			displayLabel.setFont(new Font("黑体", Font.BOLD, 22));
		}
		return displayLabel;
	}

	private JButton getPlayButton() {
		if (playButton == null) {
			playButton = new JButton("Play");
			// playButton需要和其他按钮和显示屏进行通信
			playButton.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					getPlayButton().setEnabled(false);
					getStopButton().setEnabled(true);
					getRewindButton().setEnabled(true);
					getDisplayLabel().setText("Playing......");
				}
			});
		}
		return playButton;
	}

	private JButton getStopButton() {
		if (stopButton == null) {
			stopButton = new JButton("Stop");
			// stopButton需要和其他按钮和显示屏进行通信
			stopButton.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					getStopButton().setEnabled(false);
					getPlayButton().setEnabled(true);
					getRewindButton().setEnabled(true);
					getDisplayLabel().setText("Stopped");
				}
			});
		}
		return stopButton;
	}

	private JButton getRewindButton() {
		if (rewindButton == null) {
			rewindButton = new JButton("Rewind");
			// rewindButton需要和其他按钮和显示屏进行通信
			rewindButton.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					getRewindButton().setEnabled(false);
					getStopButton().setEnabled(true);
					getPlayButton().setEnabled(true);
					getDisplayLabel().setText("Rewinding......");
				}
			});
		}
		return rewindButton;
	}
}