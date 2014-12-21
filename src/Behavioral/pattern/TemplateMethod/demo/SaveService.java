/**
 * 
 */
package pattern.TemplateMethod.demo;

/**
 * ����������(����ģ���ɫ)
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-5-7
 */
public abstract class SaveService implements ISaveService {

	private Object data;

	/**
	 * �������Ĺ�����Ҳ������ģ�巽����˼��
	 */
	public SaveService(Object data) {
		this.data = data;
	}

	/**
	 * ����һ�����巽��
	 */
	public Object getData() {
		return data;
	}

	/**
	 * �������ݣ�����һ��ģ�巽��
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
	 * ����ǰ�Ĳ���������һ�����ӷ���
	 */
	protected void doBeforeSave() throws Exception {
		// do nothing
	}

	/**
	 * �������������һ�����󷽷�
	 */
	protected abstract void save() throws Exception;

	/**
	 * �����Ĳ���������һ�����ӷ���
	 */
	protected void doAfterSave() throws Exception {
		// do nothing
	}
}