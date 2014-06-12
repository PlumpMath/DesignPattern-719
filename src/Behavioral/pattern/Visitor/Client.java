/**
 * 
 */
package pattern.Visitor;

/**
 * �ͻ���
 * <p>
 * ���ʾ���Ե�ʵ�����沢û�г���һ�����ӵľ��ж����֦�ڵ�Ķ������ṹ
 * ������ʵ��ϵͳ�з�����ģʽͨ�������������ӵĶ������ṹ��
 * ���ҷ�����ģʽ�������������Խ����ȼ��ṹ�����ṹ���⡣
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-17
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ObjectStructure structure = new ObjectStructure();
		structure.add(new NodeA());
		structure.add(new NodeB());
		structure.visit(new ConcreteVisitor1());
		structure.visit(new ConcreteVisitor2());
	}
}