/**
 * 
 */
package pattern.State.demo1;

/**
 * ʹ��Stateģʽʵ�ִ�״̬����
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-5-25
 */
public class DoorUsingState {

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
	 * ��������״̬�����ź͹��š� ����ʹ��Stateģʽʵ��������ܡ�
	 */
	private static class Door {

		private DoorState state;// �ŵ�״̬

		public Door() {
			this.state = new OpenState();
		}

		public DoorState getState() {
			return state;
		}

		/**
		 * �����ŵ�״̬
		 */
		public void setState(DoorState state) {
			this.state = state;
		}

		/**
		 * ����
		 */
		public void open() {
			getState().openTheDoor(this);
		}

		/**
		 * ����
		 */
		public void close() {
			getState().closeTheDoor(this);
		}
	}

	/**
	 * ��״̬�ӿ�
	 */
	private static interface DoorState {

		/**
		 * ����
		 */
		public void openTheDoor(Door door);

		/**
		 * ����
		 */
		public void closeTheDoor(Door door);
	}

	/**
	 * ����״̬
	 */
	private static class OpenState implements DoorState {

		@Override
		public void closeTheDoor(Door door) {
			System.out.println("now close the door.");
			// ������Ϊ�ر�״̬
			door.setState(new ClosedState());
		}

		@Override
		public void openTheDoor(Door door) {
			System.out.println("door is open.");
		}
	}

	/**
	 * ����״̬
	 */
	private static class ClosedState implements DoorState {

		@Override
		public void closeTheDoor(Door door) {
			System.out.println("door is closed.");
		}

		@Override
		public void openTheDoor(Door door) {
			System.out.println("now open the door.");
			// ������Ϊ��״̬
			door.setState(new OpenState());
		}
	}
}