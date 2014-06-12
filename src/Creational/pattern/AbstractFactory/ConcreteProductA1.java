/**
 * 
 */
package pattern.AbstractFactory;

/**
 * 具体产品类A1
 * <p>
 * ProductA产品等级结构的一员
 * <p>
 * 这个类是抽象工厂模式所创建的某一个产品对象所属的具体产品类
 * 这是客户端最终得到的对象，其内部一定充满了应用系统的商业逻辑
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-2-3
 */
public class ConcreteProductA1 implements ProductA {

	public String toString(){
		return "This is ConcreteProductA1.";
	}
}