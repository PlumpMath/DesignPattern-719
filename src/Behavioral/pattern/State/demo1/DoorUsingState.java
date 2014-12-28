/**
 * 
 */
package pattern.State.demo1;

/**
 * 使用State模式实现带状态的门
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-5-25
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
	 * 门
	 * <p>
	 * 门有两个状态：开着和关着。 这里使用State模式实现这个功能。
	 */
	private static class Door {

		private DoorState state;// 门的状态

		public Door() {
			this.state = new OpenState();
		}

		public DoorState getState() {
			return state;
		}

		/**
		 * 设置门的状态
		 */
		public void setState(DoorState state) {
			this.state = state;
		}

		/**
		 * 开门
		 */
		public void open() {
			getState().openTheDoor(this);
		}

		/**
		 * 关门
		 */
		public void close() {
			getState().closeTheDoor(this);
		}
	}

	/**
	 * 门状态接口
	 */
	private static interface DoorState {

		/**
		 * 开门
		 */
		public void openTheDoor(Door door);

		/**
		 * 关门
		 */
		public void closeTheDoor(Door door);
	}

	/**
	 * 开门状态
	 */
	private static class OpenState implements DoorState {

		@Override
		public void closeTheDoor(Door door) {
			System.out.println("now close the door.");
			// 将门设为关闭状态
			door.setState(new ClosedState());
		}

		@Override
		public void openTheDoor(Door door) {
			System.out.println("door is open.");
		}
	}

	/**
	 * 关门状态
	 */
	private static class ClosedState implements DoorState {

		@Override
		public void closeTheDoor(Door door) {
			System.out.println("door is closed.");
		}

		@Override
		public void openTheDoor(Door door) {
			System.out.println("now open the door.");
			// 将门设为打开状态
			door.setState(new OpenState());
		}
	}
}