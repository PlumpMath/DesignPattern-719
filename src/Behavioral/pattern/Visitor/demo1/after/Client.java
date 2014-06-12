/**
 * 
 */
package pattern.Visitor.demo1.after;

/**
 * 客户端
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-19
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