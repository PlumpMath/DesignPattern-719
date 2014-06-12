/**
 * 
 */
package pattern.State.demo1;

/**
 * ʹ��if-else���ʵ�ִ�״̬���ŵ���չ��ʾ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-5-25
 */
public class DoorUsingIfElseEx {

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
		Door door2 = new Door();
		door2.failed();
		door2.open();
		door2.close();
	}
	
	/**
	 * ��
	 * <p>
	 * ���ڳ���������״̬֮�������˵�����״̬������
	 * ʹ��if-else������������չ��Ҫ�޸�Door��Դ�룬Υ����OCPԭ��
	 */
	private static class Door {
		
		/** ���� */
		private static final int OPEN = 0;
		/** ���� */
		private static final int CLOSED = 1;
		/** ���� */
		private static final int FAILURE = 2;

		private int state;// ��ǰ״̬

		public Door() {
			this.state = OPEN;
		}

		/**
		 * ���ֹ���
		 */
		public void failed(){
			this.state = FAILURE;
		}
		
		/**
		 * ����
		 */
		public void open() {
			if (state == FAILURE) {
				System.out.println("door is failure,can not be opened.");
			} else if (state == OPEN) {
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
			if (state == FAILURE) {
				System.out.println("door is failure,can not be closed.");
			} else if (state == CLOSED) {
				System.out.println("door is closed.");
			} else {
				System.out.println("now close the door.");
				this.state = CLOSED;
			}
		}
	}
}