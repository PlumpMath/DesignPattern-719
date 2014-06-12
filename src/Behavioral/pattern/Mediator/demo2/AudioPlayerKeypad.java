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
 * ¼��������
 * <p>
 * û��ʹ�õ�ͣ��ģʽ�Ĵ�ͳʵ�ַ�ʽ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-9
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
			displayLabel.setFont(new Font("����", Font.BOLD, 22));
		}
		return displayLabel;
	}

	private JButton getPlayButton() {
		if (playButton == null) {
			playButton = new JButton("Play");
			// playButton��Ҫ��������ť����ʾ������ͨ��
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
			// stopButton��Ҫ��������ť����ʾ������ͨ��
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
			// rewindButton��Ҫ��������ť����ʾ������ͨ��
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