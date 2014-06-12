/**
 * 
 */
package pattern.State.demo2;

/**
 * ʹ��if-elseʵ�ֵ�ָ��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-5-26
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
	 * ����ö��
	 */
	private static enum Direction {
		EAST, WEST, SOUTH, NORTH
	}

	/**
	 * ָ����
	 * <p>
	 * ָ����ĳ��ʱ�̱ض�ָ�����ϱ��ĸ������е�һ����
	 */
	private static class Pointer {

		private Direction direction;// ��ǰ����

		public Pointer() {
			this.direction = Direction.EAST;
		}

		public void setDirection(Direction direction) {
			this.direction = direction;
		}

		/**
		 * ����תһ������
		 */
		public void turnLeft() {
			System.out.println("turnLeftǰָ��" + direction.name());
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
			System.out.println("turnLeft��ָ��" + direction.name());
		}

		/**
		 * ����תһ������
		 */
		public void turnRight() {
			System.out.println("turnRightǰָ��" + direction.name());
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
			System.out.println("turnRight��ָ��" + direction.name());
		}
	}
}