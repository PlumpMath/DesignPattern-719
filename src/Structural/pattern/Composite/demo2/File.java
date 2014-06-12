/**
 * 
 */
package pattern.Composite.demo2;

/**
 * 标准文件
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-11
 */
public class File implements IFile {

	@Override
	public void info() {
		System.out.println("This is a file.");
	}
}