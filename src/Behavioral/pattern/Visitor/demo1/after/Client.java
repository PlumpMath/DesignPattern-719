/**
 * 
 */
package pattern.Visitor.demo1.after;

/**
 * �ͻ���
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-19
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Company company = new Company();
		IncomeReportGenerator gen = new IncomeReportGenerator(company);
		gen.generate4Chairman();
		gen.generate4Revenue();
	}
}