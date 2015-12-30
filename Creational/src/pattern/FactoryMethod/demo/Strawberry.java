/**
 * 
 */
package pattern.FactoryMethod.demo;

/**
 * 草莓
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-2-3
 */
public class Strawberry implements Fruit {

	@Override
	public void grow() {
		System.out.println("Strawberry is growing.");
	}

	@Override
	public void harvest() {
		System.out.println("Strawberry has been harvested.");
	}

	@Override
	public void plant() {
		System.out.println("Strawberry has been planted.");
	}
}
