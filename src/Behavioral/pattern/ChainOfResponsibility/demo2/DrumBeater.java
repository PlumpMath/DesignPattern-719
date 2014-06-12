/**
 * 
 */
package pattern.ChainOfResponsibility.demo2;

import java.util.Timer;
import java.util.TimerTask;

/**
 * ������
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-10
 */
public class DrumBeater {

	private Timer timer;// ��ʱ��
	private boolean stopped;// �Ƿ��Ѿ�ֹͣ����
	
	public DrumBeater(){
		this.timer = new Timer();
	}

	/**
	 * �Ƿ��Ѿ�ֹͣ����
	 */
	public boolean isStopped() {
		return stopped;
	}
	
	/**
	 * ��ʼ����
	 */
	public void startBeating(){
		System.out.println("��ʼ������...");
		// 1��֮��ֹͣ����
		timer.schedule(new StopBeatingTask(), 1000);
	}
	
	/**
	 * ֹͣ��������
	 */
	private class StopBeatingTask extends TimerTask {

		@Override
		public void run() {
			System.out.println("ֹͣ������...");
			stopped = true;
			timer.cancel();
		}
	}
}