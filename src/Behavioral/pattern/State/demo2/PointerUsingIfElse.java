/**
 * 
 */
package pattern.State.demo2;

/**
 * 使用if-else实现的指针
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-5-26
 */
public class PointerUsingIfElse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Pointer pointer = new Pointer();
		pointer.turnLeft();
		pointer.turnLeft();
		pointer.turnLeft();
		pointer.turnRight();
		pointer.turnRight();
	}

	/**
	 * 方向枚举
	 */
	private static enum Direction {
		EAST, WEST, SOUTH, NORTH
	}

	/**
	 * 指针类
	 * <p>
	 * 指针在某个时刻必定指向东西南北四个方向中的一个。
	 */
	private static class Pointer {

		private Direction direction;// 当前方向

		public Pointer() {
			this.direction = Direction.EAST;
		}

		public void setDirection(Direction direction) {
			this.direction = direction;
		}

		/**
		 * 向左转一个方向
		 */
		public void turnLeft() {
			System.out.println("turnLeft前指向：" + direction.name());
			switch (direction) {
			case EAST:
				setDirection(Direction.NORTH);
				break;
			case WEST:
				setDirection(Direction.SOUTH);
				break;
			case SOUTH:
				setDirection(Direction.EAST);
				break;
			case NORTH:
				setDirection(Direction.WEST);
				break;
			}
			System.out.println("turnLeft后指向：" + direction.name());
		}

		/**
		 * 向右转一个方向
		 */
		public void turnRight() {
			System.out.println("turnRight前指向：" + direction.name());
			switch (direction) {
			case EAST:
				setDirection(Direction.SOUTH);
				break;
			case WEST:
				setDirection(Direction.NORTH);
				break;
			case SOUTH:
				setDirection(Direction.WEST);
				break;
			case NORTH:
				setDirection(Direction.EAST);
				break;
			}
			System.out.println("turnRight后指向：" + direction.name());
		}
	}
}