/**
 * 
 */
package pattern.ChainOfResponsibility.demo2;

/**
 * �μӻ��Ĵ��������
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-10
 */
public class Player {

	private String name;// ����

	private Player nextPlayer;// ��һ�����

	private DrumBeater drumBeater;// ������

	public Player(String name) {
		this.name = name;
	}

	/**
	 * @param name
	 *            ����
	 * @param nextPlayer
	 *            ��һ�����
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
	 * ��������
	 */
	public void handle(String request) {
		if (getNextPlayer() == null) {
			System.out.println(getName() + " �Ѿ������һ���ˡ�");
			System.exit(0);
		} else {
			try {
				Thread.sleep((long) (Math.random()*100));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			// ����ֹͣ�ˣ���ץס��
			if (drumBeater.isStopped()) {
				System.out.println(getName() + " ��ץס�ˣ�Ҫ�Ⱦơ� ");
			} else {
				// �������ݸ���һ�����
				System.out.println(getName() + " ���� " + request + " �� "
						+ getNextPlayer().getName());
				getNextPlayer().handle(request);
			}
		}
	}
}