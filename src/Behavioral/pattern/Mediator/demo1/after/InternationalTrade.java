/**
 * 
 */
package pattern.Mediator.demo1.after;

/**
 * ����ó��(�ͻ���)��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-8
 */
public class InternationalTrade {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WTO wto = new WTO();
		China china = new China(wto);
		USA usa = new USA(wto);
		
		china.exports2USA(500);
		china.exports2USA(800);
		usa.exports2China(500);
		china.importsFromUSA(500);
		usa.importsFromChina(1500);
		china.importsFromUSA(1500);
		china.exports2USA(10000);
		
		china.statistics();
		usa.statistics();
	}
}