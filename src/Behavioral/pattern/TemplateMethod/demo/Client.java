/**
 * 
 */
package pattern.TemplateMethod.demo;

/**
 * �ͻ���
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-5-7
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String data = "this is data.";
		ISaveService service = new DBSaveService("oracle", data);
		service.saveData();
		service = new FileSaveService("C:\\a.txt", data);
		service.saveData();
	}
}