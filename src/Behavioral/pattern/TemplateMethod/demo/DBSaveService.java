/**
 * 
 */
package pattern.TemplateMethod.demo;

/**
 * ���ݿⱣ�����
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-5-7
 */
public class DBSaveService extends SaveService {

	private String dbname;// ���ݿ�����
	
	public DBSaveService(String dbname,Object data) {
		super(data);
		this.dbname = dbname;
	}

	/**
	 * ����Ҫʵ�ֵ��ǳ��󷽷�
	 *
	 * @see pattern.TemplateMethod.demo.SaveService#save()
	 */
	protected void save() throws Exception {
		System.out.println("save data to Database " + dbname);
	}

	/**
	 * ѡ��ʵ����������ӷ���
	 *
	 * @see pattern.TemplateMethod.demo.SaveService#doAfterSave()
	 */
	protected void doAfterSave() throws Exception{
		System.out.println("save data to Database completely.");
	}
}