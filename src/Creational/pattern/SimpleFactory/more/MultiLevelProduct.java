/**
 * 
 */
package pattern.SimpleFactory.more;

/**
 * 1.多级次产品结构
 * <p>
 * 在真实的系统中，产品可以形成复杂的等级结构
 * 简单工厂模式采取的是以不变应万变的策略，一律使用同一个工厂类
 * 从Factory类到各个Product类的连线代表创建(依赖)关系；
 * 从Client到其他类的连线是一般依赖关系
 * <p>
 * 优点：
 * 设计简单，产品类的等级结构不会反映到工厂类中来，
 * 从而产品类的等级结构的变化也不会影响到工厂类。
 * 缺点：
 * 增加新的产品必将导致工厂类的修改
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-2-4
 */
public class MultiLevelProduct {

}

/**
 * 使用Shape的客户端类
 */
class ShapeClient {

	static void consume() {
		ShapeFactory.create("Triangle");
		// ... ...
	}
}

/**
 * Shape工厂类
 */
class ShapeFactory {

	static Shape create(String which) {
		if (which.equalsIgnoreCase("Triangle")) {
			return new Triangle();
		} else if (which.equalsIgnoreCase("Rectangle")) {
			return new Rectangle();
		} else if (which.equalsIgnoreCase("Square")) {
			return new Square();
		}
		return null;
	}
}

/**
 * 产品类接口Shape
 * <p>
 * 如果模式所产生的产品类彼此之间没有共同的商业逻辑，
 * 那么抽象产品角色可以由一个Java接口扮演，
 * 相反，如果这些具体产品类彼此之间确实有共同的商业逻辑，
 * 那么这些公有的逻辑就应当移动到抽象角色里面，
 * 这就意味着抽象角色应当由一个抽象类扮演。
 */
interface Shape {

}

/**
 * 三角形
 */
class Triangle implements Shape {

}

/**
 * 四边形
 */
abstract class Quadrangle implements Shape {

}

/**
 * 矩形
 */
class Rectangle extends Quadrangle {

}

/**
 * 菱形
 */
class Diamond extends Quadrangle {

}

/**
 * 正方形
 */
class Square extends Diamond {

}