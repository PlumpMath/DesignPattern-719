/**
 * 
 */
package pattern.ChainOfResponsibility.demo2;

/**
 * 参加击鼓传花的玩家
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-10
 */
public class Player {

	private String name;// 姓名

	private Player nextPlayer;// 下一个玩家

	private DrumBeater drumBeater;// 击鼓者

	public Player(String name) {
		this.name = name;
	}

	/**
	 * @param name
	 *            姓名
	 * @param nextPlayer
	 *            下一个玩家
	 */
	public Player(String name, Player nextPlayer) {
		this.name = name;
		this.nextPlayer = nextPlayer;
		this.setDrumBeater(nextPlayer.getDrumBeater());
	}

	private String getName() {
		return name;
	}

	private Player getNextPlayer() {
		return nextPlayer;
	}

	public void setNextPlayer(Player nextPlayer) {
		this.nextPlayer = nextPlayer;
	}

	public void setDrumBeater(DrumBeater drumBeater) {
		this.drumBeater = drumBeater;
	}

	private DrumBeater getDrumBeater() {
		return drumBeater;
	}

	/**
	 * 处理请求
	 */
	public void handle(String request) {
		if (getNextPlayer() == null) {
			System.out.println(getName() + " 已经是最后一个了。");
			System.exit(0);
		} else {
			try {
				Thread.sleep((long) (Math.random()*100));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			// 击鼓停止了，被抓住了
			if (drumBeater.isStopped()) {
				System.out.println(getName() + " 被抓住了，要喝酒。 ");
			} else {
				// 将花传递给下一个玩家
				System.out.println(getName() + " 传递 " + request + " 给 "
						+ getNextPlayer().getName());
				getNextPlayer().handle(request);
			}
		}
	}
}