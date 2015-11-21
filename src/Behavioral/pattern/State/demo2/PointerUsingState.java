/**
 * 
 */
package pattern.State.demo2;

/**
 * 使用State模式实现的指针
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-5-26
 */
public class PointerUsingState {

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
	 * 指针类
	 * <p>
	 * 指针在某个时刻必定指向东西南北四个方向中的一个。
	 */
	private static class Pointer {

		private Direction direction;// 当前方向

		public Pointer() {
			this.direction = new East();
		}

		public void setDirection(Direction direction) {
			this.direction = direction;
		}

		/**
		 * 逆时针转一下
		 */
		public void turnAntiClockwise() {
			System.out.println("turnAntiClockwise前指向：" + direction.getName());
			direction.antiClockwise(this);
			System.out.println("turnAntiClockwise后指向：" + direction.getName());
		}

		/**
		 * 顺时针转一下
		 */
		public void turnClockwise() {
			System.out.println("turnClockwise前指向：" + direction.getName());
			direction.clockwise(this);
			System.out.println("turnClockwise后指向：" + direction.getName());
		}
	}

	/**
	 * 方向状态接口
	 */
	private static interface Direction {

		/**
		 * 逆时针转
		 */
		public void antiClockwise(Pointer pointer);

		/**
		 * 顺时针转
		 */
		public void clockwise(Pointer pointer);

		/**
		 * 方向状态名称
		 */
		public String getName();
	}

	/**
	 * 东
	 */
	private static class East implements Direction {

		/** 单例 */
		private static final Direction INSTANCE = new East();

		private East() {
			// do nothing and single instance
		}

		public static Direction getInstance() {
			return INSTANCE;
		}

		@Override
		public void antiClockwise(Pointer pointer) {
			pointer.setDirection(North.getInstance());
		}

		@Override
		public void clockwise(Pointer pointer) {
			pointer.setDirection(South.getInstance());
		}

		@Override
		public String getName() {
			return "EAST";
		}
	}

	/**
	 * 西
	 */
	private static class West implements Direction {

		/** 单例 */
		private static final Direction INSTANCE = new West();

		private West() {
			// do nothing and single instance
		}

		public static Direction getInstance() {
			return INSTANCE;
		}

		@Override
		public void antiClockwise(Pointer pointer) {
			pointer.setDirection(South.getInstance());
		}

		@Override
		public void clockwise(Pointer pointer) {
			pointer.setDirection(North.getInstance());
		}

		@Override
		public String getName() {
			return "WEST";
		}
	}

	/**
	 * 南
	 */
	private static class South implements Direction {

		/** 单例 */
		private static final Direction INSTANCE = new South();

		private South() {
			// do nothing and single instance
		}

		public static Direction getInstance() {
			return INSTANCE;
		}

		@Override
		public void antiClockwise(Pointer pointer) {
			pointer.setDirection(East.getInstance());
		}

		@Override
		public void clockwise(Pointer pointer) {
			pointer.setDirection(West.getInstance());
		}

		@Override
		public String getName() {
			return "SOUTH";
		}
	}

	/**
	 * 北
	 */
	private static class North implements Direction {

		/** 单例 */
		private static final Direction INSTANCE = new North();

		private North() {
			// do nothing and single instance
		}

		public static Direction getInstance() {
			return INSTANCE;
		}

		@Override
		public void antiClockwise(Pointer pointer) {
			pointer.setDirection(West.getInstance());
		}

		@Override
		public void clockwise(Pointer pointer) {
			pointer.setDirection(East.getInstance());
		}

		@Override
		public String getName() {
			return "NORTH";
		}
	}
}
