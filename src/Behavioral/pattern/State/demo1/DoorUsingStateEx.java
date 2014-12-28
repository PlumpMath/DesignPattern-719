/**
 * 
 */
package pattern.State.demo1;

/**
 * 使用State模式实现带状态的门的扩展演示
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-5-25
 */
public class DoorUsingStateEx {

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
	 * 门
	 * <p>
	 * 现在除了有两个状态之外又有了第三个状态：故障。
	 * 使用State模式进行这样的扩展不需要修改Door类源码，遵循OCP原则
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
		 * 门发生故障
		 */
		public void failed(){
			this.setState(new FailureState());
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
		 * 
		 * @param door
		 *            门对象
		 */
		public void openTheDoor(Door door);

		/**
		 * 关门
		 * 
		 * @param door
		 *            门对象
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
	
	/**
	 * 故障状态
	 */
	private static class FailureState implements DoorState {

		@Override
		public void closeTheDoor(Door door) {
			System.out.println("door is failure,can not be closed.");
		}

		@Override
		public void openTheDoor(Door door) {
			System.out.println("door is failure,can not be opened.");
		}
	}
}