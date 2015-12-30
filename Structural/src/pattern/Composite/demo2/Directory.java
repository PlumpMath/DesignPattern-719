/**
 * 
 */
package pattern.Composite.demo2;

import java.util.ArrayList;
import java.util.List;

/**
 * 文件夹类
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-11
 */
public class Directory implements IFile {

	private List<IFile> files;

	@Override
	public void info() {
		System.out.println("This is a Directory.\nlist files:\n{");
		for (IFile file : getFiles()) {
			file.info();
		}
		System.out.println("}");
	}

	/**
	 * 添加一个文件
	 */
	public void add(IFile file) {
		getFiles().add(file);
	}

	/**
	 * 删除指定文件
	 */
	public void remove(IFile file) {
		getFiles().remove(file);
	}

	/**
	 * 返回所有文件
	 */
	public List<IFile> getFiles() {
		if (files == null) {
			files = new ArrayList<IFile>();
		}
		return files;
	}
}
