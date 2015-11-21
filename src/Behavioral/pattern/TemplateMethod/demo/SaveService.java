/**
 * 
 */
package pattern.TemplateMethod.demo;

/**
 * 保存服务基类(抽象模板角色)
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-5-7
 */
public abstract class SaveService implements ISaveService {

	private Object data;

	/**
	 * 抽象基类的构造子也体现了模板方法的思想
	 */
	public SaveService(Object data) {
		this.data = data;
	}

	/**
	 * 这是一个具体方法
	 */
	public Object getData() {
		return data;
	}

	/**
	 * 保存数据，这是一个模板方法
	 */
	public final void saveData() {
		try {
			doBeforeSave();
			save();
			doAfterSave();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * 保存前的操作，这是一个钩子方法
	 */
	protected void doBeforeSave() throws Exception {
		// do nothing
	}

	/**
	 * 保存操作，这是一个抽象方法
	 */
	protected abstract void save() throws Exception;

	/**
	 * 保存后的操作，这是一个钩子方法
	 */
	protected void doAfterSave() throws Exception {
		// do nothing
	}
}
