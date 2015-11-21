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
		pointer.turnAntiClockwise();
		pointer.turnAntiClockwise();
		pointer.turnAntiClockwise();
		pointer.turnClockwise();
		pointer.turnClockwise();
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
		 * 逆时针转一下
		 */
		public void turnAntiClockwise() {
			System.out.println("turnAntiClockwise前指向：" + direction.name());
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
			System.out.println("turnAntiClockwise后指向：" + direction.name());
		}

		/**
		 * 顺时针转一下
		 */
		public void turnClockwise() {
			System.out.println("turnClockwise前指向：" + direction.name());
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
			System.out.println("turnClockwise后指向：" + direction.name());
		}
	}
}
