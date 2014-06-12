/**
 * 
 */
package pattern.ChainOfResponsibility.demo2;

import java.util.Timer;
import java.util.TimerTask;

/**
 * 击鼓者
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-10
 */
public class DrumBeater {

	private Timer timer;// 定时器
	private boolean stopped;// 是否已经停止击鼓
	
	public DrumBeater(){
		this.timer = new Timer();
	}

	/**
	 * 是否已经停止击鼓
	 */
	public boolean isStopped() {
		return stopped;
	}
	
	/**
	 * 开始击鼓
	 */
	public void startBeating(){
		System.out.println("开始击鼓了...");
		// 1秒之后停止击鼓
		timer.schedule(new StopBeatingTask(), 1000);
	}
	
	/**
	 * 停止击鼓任务
	 */
	private class StopBeatingTask extends TimerTask {

		@Override
		public void run() {
			System.out.println("停止击鼓了...");
			stopped = true;
			timer.cancel();
		}
	}
}