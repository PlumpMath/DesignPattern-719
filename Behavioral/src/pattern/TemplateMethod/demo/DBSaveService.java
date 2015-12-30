/**
 * 
 */
package pattern.TemplateMethod.demo;

/**
 * 数据库保存服务
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-5-7
 */
public class DBSaveService extends SaveService {

	private String dbname;// 数据库名称
	
	public DBSaveService(String dbname, Object data) {
		super(data);
		this.dbname = dbname;
	}

	/**
	 * 必须要实现的是抽象方法
	 *
	 * @see pattern.TemplateMethod.demo.SaveService#save()
	 */
	protected void save() throws Exception {
		System.out.println("save data to Database " + dbname);
	}

	/**
	 * 选择实现了这个钩子方法
	 *
	 * @see pattern.TemplateMethod.demo.SaveService#doAfterSave()
	 */
	protected void doAfterSave() throws Exception{
		System.out.println("save data to Database completely.");
	}
}
