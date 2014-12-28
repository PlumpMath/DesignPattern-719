/**
 * 
 */
package pattern.State.demo2;

/**
 * ʹ��Stateģʽʵ�ֵ�ָ��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-5-26
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
	 * ָ����
	 * <p>
	 * ָ����ĳ��ʱ�̱ض�ָ�����ϱ��ĸ������е�һ����
	 */
	private static class Pointer {

		private Direction direction;// ��ǰ����

		public Pointer() {
			this.direction = new East();
		}

		public void setDirection(Direction direction) {
			this.direction = direction;
		}

		/**
		 * ��ʱ��תһ��
		 */
		public void turnAntiClockwise() {
			System.out.println("turnAntiClockwiseǰָ��" + direction.getName());
			direction.antiClockwise(this);
			System.out.println("turnAntiClockwise��ָ��" + direction.getName());
		}

		/**
		 * ˳ʱ��תһ��
		 */
		public void turnClockwise() {
			System.out.println("turnClockwiseǰָ��" + direction.getName());
			direction.clockwise(this);
			System.out.println("turnClockwise��ָ��" + direction.getName());
		}
	}

	/**
	 * ����״̬�ӿ�
	 */
	private static interface Direction {

		/**
		 * ��ʱ��ת
		 */
		public void antiClockwise(Pointer pointer);

		/**
		 * ˳ʱ��ת
		 */
		public void clockwise(Pointer pointer);

		/**
		 * ����״̬����
		 */
		public String getName();
	}

	/**
	 * ��
	 */
	private static class East implements Direction {

		/** ���� */
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
	 * ��
	 */
	private static class West implements Direction {

		/** ���� */
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
	 * ��
	 */
	private static class South implements Direction {

		/** ���� */
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
	 * ��
	 */
	private static class North implements Direction {

		/** ���� */
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