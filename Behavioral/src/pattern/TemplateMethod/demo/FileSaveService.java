/**
 * 
 */
package pattern.TemplateMethod.demo;

/**
 * 文件保存服务
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-5-7
 */
public class FileSaveService extends SaveService {

	private String filePath;// 文件路径

	public FileSaveService(String filePath, Object data) {
		super(data);
		this.filePath = filePath;
	}

	/**
	 * 选择实现了这个钩子方法
	 *
	 * @see pattern.TemplateMethod.demo.SaveService#doAfterSave()
	 */
	protected void doBeforeSave() throws Exception {
		if (!fileExists(filePath)) {
			createFile(filePath);
		}
	}

	private boolean fileExists(String filePath) {
		return false;
	}

	private void createFile(String filePath) {
		System.out.println("create file " + filePath);
	}

	/**
	 * 必须要实现的是抽象方法
	 *
	 * @see pattern.TemplateMethod.demo.SaveService#save()
	 */
	protected void save() throws Exception {
		System.out.println("save data to File......");
	}

	/**
	 * 选择实现了这个钩子方法
	 *
	 * @see pattern.TemplateMethod.demo.SaveService#doAfterSave()
	 */
	protected void doAfterSave() throws Exception {
		System.out.println("save data to File completely.");
	}
}
