/**
 * 
 */
package pattern.State.demo1;

/**
 * ʹ��if-else���ʵ�ִ�״̬����
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-5-25
 */
public class DoorUsingIfElse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Door door = new Door();
		door.close();
		door.close();
		door.open();
		door.open();
		door.close();
		door.open();
	}
	
	/**
	 * ��
	 * <p>
	 * ��������״̬�����ź͹��š�����ʹ�ô�ͳ��if-else���ʵ��������ܡ�
	 */
	private static class Door {
		
		/** ���� */
		private static final int OPEN = 0;
		/** ���� */
		private static final int CLOSED = 1;

		private int state;// ��ǰ״̬

		public Door() {
			this.state = OPEN;
		}

		/**
		 * ����
		 */
		public void open() {
			if (state == OPEN) {
				System.out.println("door is open.");
			} else {
				System.out.println("now open the door.");
				this.state = OPEN;
			}
		}

		/**
		 * ����
		 */
		public void close() {
			if (state == CLOSED) {
				System.out.println("door is closed.");
			} else {
				System.out.println("now close the door.");
				this.state = CLOSED;
			}
		}
	}
}