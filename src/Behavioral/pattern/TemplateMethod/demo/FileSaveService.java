/**
 * 
 */
package pattern.TemplateMethod.demo;

/**
 * �ļ��������
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-5-7
 */
public class FileSaveService extends SaveService {

	private String filePath;// �ļ�·��

	public FileSaveService(String filePath, Object data) {
		super(data);
		this.filePath = filePath;
	}

	/**
	 * ѡ��ʵ����������ӷ���
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
	 * ����Ҫʵ�ֵ��ǳ��󷽷�
	 *
	 * @see pattern.TemplateMethod.demo.SaveService#save()
	 */
	protected void save() throws Exception {
		System.out.println("save data to File......");
	}

	/**
	 * ѡ��ʵ����������ӷ���
	 *
	 * @see pattern.TemplateMethod.demo.SaveService#doAfterSave()
	 */
	protected void doAfterSave() throws Exception {
		System.out.println("save data to File completely.");
	}
}