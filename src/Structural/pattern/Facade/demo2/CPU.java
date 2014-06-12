/**
 * 
 */
package pattern.Facade.demo2;

/**
 * CPU
 * <p>
 * �������ϵͳ֮һ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-25
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