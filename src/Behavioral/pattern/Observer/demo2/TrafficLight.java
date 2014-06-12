/**
 * 
 */
package pattern.Observer.demo2;

/**
 * ���̵�
 * <p>
 * ���屻�۲��߽�ɫ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-5-10
 */
public class TrafficLight extends AbstractSource {

	/**
	 * ���̵���ɫö��
	 */
	public enum TrafficLightColor {
		/** �� */
		RED, 
		/** �� */
		GREEN
	}
	
	private TrafficLightColor color = TrafficLightColor.RED;// ��ǰ��ɫ
	private boolean isRunning = true;// �Ƿ���������

	/**
	 * ���ص�ǰ��ɫ
	 */
	public TrafficLightColor getColor() {
		return color;
	}

	/**
	 * �ı䵱ǰ��ɫ
	 */
	public void setColor(TrafficLightColor color) {
		if (isRunning) {
			if (!color.equals(getColor())) {
				this.color = color;
				System.out.println("\nNow light is " + color.name().toLowerCase());
				// ��һ�����̵���ɫ�ı��¼�
				fireEvent(new TrafficLightEvent(EventType.COLOR_CHANGED, this));
			}
		}
	}

	/**
	 * �Ƿ���������
	 */
	public boolean isRunning() {
		return isRunning;
	}

	/**
	 * ��������״̬
	 */
	public void setRunning(boolean isRunning) {
		if (this.isRunning != isRunning) {
			this.isRunning = isRunning;
			System.out.println("\nNow light is "
					+ (isRunning ? "running" : "failure"));
			// ��һ�����̵����й����¼�
			fireEvent(new TrafficLightEvent(EventType.LIGHT_FAILURE, this));
		}
	}
}