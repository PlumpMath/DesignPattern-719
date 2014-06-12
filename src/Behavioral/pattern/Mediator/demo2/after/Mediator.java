/**
 * 
 */
package pattern.Mediator.demo2.after;

import javax.swing.JButton;
import javax.swing.JLabel;

/**
 * 调停器
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-9
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
	 * 播放
	 */
	public void play() {
		playButton.setEnabled(false);
		stopButton.setEnabled(true);
		rewindButton.setEnabled(true);
		displayLabel.setText("Play......");
	}

	/**
	 * 停止
	 */
	public void stop() {
		playButton.setEnabled(true);
		stopButton.setEnabled(false);
		rewindButton.setEnabled(true);
		displayLabel.setText("Stopped");
	}

	/**
	 * 倒带
	 */
	public void rewind() {
		playButton.setEnabled(true);
		stopButton.setEnabled(true);
		rewindButton.setEnabled(false);
		displayLabel.setText("Rewind......");
	}
}