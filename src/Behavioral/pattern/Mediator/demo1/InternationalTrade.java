/**
 * 
 */
package pattern.Mediator.demo1;

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
		China china = new China();
		USA usa = new USA();
		china.setUSA(usa);
		usa.setChina(china);

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