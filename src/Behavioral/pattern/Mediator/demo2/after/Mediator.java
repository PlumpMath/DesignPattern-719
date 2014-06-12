/**
 * 
 */
package pattern.Mediator.demo2.after;

import javax.swing.JButton;
import javax.swing.JLabel;

/**
 * ��ͣ��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-9
 */
public class Mediator {

	private JLabel displayLabel;
	private JButton playButton;
	private JButton stopButton;
	private JButton rewindButton;

	public void setDisplayLabel(JLabel displayLabel) {
		this.displayLabel = displayLabel;
	}

	public void setPlayButton(JButton playButton) {
		this.playButton = playButton;
	}

	public void setStopButton(JButton stopButton) {
		this.stopButton = stopButton;
	}

	public void setRewindButton(JButton rewindButton) {
		this.rewindButton = rewindButton;
	}

	/**
	 * ����
	 */
	public void play() {
		playButton.setEnabled(false);
		stopButton.setEnabled(true);
		rewindButton.setEnabled(true);
		displayLabel.setText("Play......");
	}

	/**
	 * ֹͣ
	 */
	public void stop() {
		playButton.setEnabled(true);
		stopButton.setEnabled(false);
		rewindButton.setEnabled(true);
		displayLabel.setText("Stopped");
	}

	/**
	 * ����
	 */
	public void rewind() {
		playButton.setEnabled(true);
		stopButton.setEnabled(true);
		rewindButton.setEnabled(false);
		displayLabel.setText("Rewind......");
	}
}