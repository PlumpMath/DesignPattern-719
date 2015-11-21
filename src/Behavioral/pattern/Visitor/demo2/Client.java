/**
 * 
 */
package pattern.Visitor.demo2;

import java.util.ArrayList;
import java.util.List;

/**
 * 客户端
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-20
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ComputerMall mall = new ComputerMall();
		mall.order(createOrder());
	}

	private static List<Equipment> createOrder() {
		List<Equipment> equipments = new ArrayList<Equipment>();
		for (int i = 0; i < 10; i++) {
			equipments.add(new CPU());
		}
		for (int i = 0; i < 8; i++) {
			equipments.add(new Case());
		}
		for (int i = 0; i < 7; i++) {
			equipments.add(new HardDisk());
		}
		for (int i = 0; i < 5; i++) {
			equipments.add(new Mainboard());
		}
		for (int i = 0; i < 3; i++) {
			equipments.add(new IntegratedBoard());
		}
		for (int i = 0; i < 3; i++) {
			equipments.add(new PC());
		}
		return equipments;
	}
}
