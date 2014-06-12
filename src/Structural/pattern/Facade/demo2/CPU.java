/**
 * 
 */
package pattern.Facade.demo2;

/**
 * CPU
 * <p>
 * 计算机子系统之一
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-25
 */
public class CPU {

	public void freeze() {
		System.out.println("CPU.freeze()");
	}

	public void jump(long position) {
		System.out.println("CPU.jump " + position);
	}

	public void execute() {
		System.out.println("CPU.execute()");
	}
}