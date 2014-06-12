/**
 * 
 */
package pattern.Composite.demo2;

import java.util.ArrayList;
import java.util.List;

/**
 * �ļ�����
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-11
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
	 * ���һ���ļ�
	 */
	public void add(IFile file) {
		getFiles().add(file);
	}

	/**
	 * ɾ��ָ���ļ�
	 */
	public void remove(IFile file) {
		getFiles().remove(file);
	}

	/**
	 * ���������ļ�
	 */
	public List<IFile> getFiles() {
		if (files == null) {
			files = new ArrayList<IFile>();
		}
		return files;
	}
}