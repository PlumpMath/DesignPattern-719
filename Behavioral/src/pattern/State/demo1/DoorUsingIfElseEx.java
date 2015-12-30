/**
 * 
 */
package pattern.State.demo1;

/**
 * 使用if-else语句实现带状态的门的扩展演示
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-5-25
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
	 * 门
	 * <p>
	 * 现在除了有两个状态之外又有了第三个状态：故障。
	 * 使用if-else进行这样的扩展需要修改Door类源码，违反了OCP原则
	 */
	private static class Door {
		
		/** 开着 */
		private static final int OPEN = 0;
		/** 关着 */
		private static final int CLOSED = 1;
		/** 故障 */
		private static final int FAILURE = 2;

		private int state;// 当前状态

		public Door() {
			this.state = OPEN;
		}

		/**
		 * 出现故障
		 */
		public void failed(){
			this.state = FAILURE;
		}
		
		/**
		 * 开门
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
		 * 关门
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
