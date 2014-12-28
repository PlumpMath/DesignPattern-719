/**
 * 
 */
package pattern.State.demo1;

/**
 * 使用if-else语句实现带状态的门
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-5-25
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
	 * 门
	 * <p>
	 * 门有两个状态：开着和关着。这里使用传统的if-else语句实现这个功能。
	 */
	private static class Door {
		
		/** 开着 */
		private static final int OPEN = 0;
		/** 关着 */
		private static final int CLOSED = 1;

		private int state;// 当前状态

		public Door() {
			this.state = OPEN;
		}

		/**
		 * 开门
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
		 * 关门
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