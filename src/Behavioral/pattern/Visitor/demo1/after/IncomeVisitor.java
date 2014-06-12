/**
 * 
 */
package pattern.Visitor.demo1.after;

/**
 * ��������߽ӿ�
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-19
 */
public interface IncomeVisitor {

	/**
	 * ����CEO
	 */
	public void visit(CEO ceo);

	/**
	 * �����ܾ���
	 */
	public void visit(GeneralManager gm);

	/**
	 * ���ʲ��ž���
	 */
	public void visit(DeptManager dm);

	/**
	 * ������ͨ��Ա
	 */
	public void visit(Employee em);

	/**
	 * �����ܶ�
	 */
	public double getTotal();
}