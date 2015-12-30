/**
 * 
 */
package pattern.SimpleFactory.more;

/**
 * 4.抽象产品角色就是工厂(工厂角色和抽象产品角色合并)
 * <p>
 * 工厂角色可以由抽象产品角色扮演，一个抽象产品类同时是子类的工厂
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-2-4
 */
public class AbsProductIsFactory {

}

/**
 * 使用Sport的客户端
 */
class SportClient {

	static void consume() {
		Sport.getInstance("football");
		Sport.getInstance("basketball");
	}
}

/**
 * 运动类
 */
abstract class Sport {

	static Sport getInstance(String which) {
		if (which.equalsIgnoreCase("football")) {
			return new Football();
		} else if (which.equalsIgnoreCase("basketball")) {
			return new Basketball();
		}
		return null;
	}
}

/**
 * 足球类
 */
class Football extends Sport {
}

/**
 * 篮球类
 */
class Basketball extends Sport {
}
