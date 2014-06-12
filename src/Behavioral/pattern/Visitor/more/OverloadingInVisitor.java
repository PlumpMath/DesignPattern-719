/**
 * 
 */
package pattern.Visitor.more;

/**
 * Visitor�ӿڷ�������
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-24
 */
public class OverloadingInVisitor {

}

/**
 * Ϊʲô��ʹ�ö�̬��ԭ�򽫸������ʷ�������������Ϊvisit()������ע�͵��Ĳ��֡�
 * һ����ԣ�Java���ʦʹ�÷���������Ҫ�������µ�һ�����̣�
 * 1.��ѧ�߲��á�
 * ���ǻ�û����ʶ����Java������ʹ�����صĺô���
 * 2.�еȳ̶��ߵ����á�
 * ������ʶ����Java��ʹ�����صĺô������ǣ����ǿ���ʹ�����صĵط�����ʹ�����ء�
 * 3.����һЩĥ��֮����������ʦ����ʶ����
 * �����ںܶ�����»���ɲ���Ҫ�����󣬴Ӷ�������ʲô�����Ӧ������ʹ�����ء�
 * ����һ���������20��Visitable��ʵ���࣬��ô�����߾ͻ���20����Ӧ�ķ��ʷ�����
 * ���ʹ�����أ�������20������������ͬ�������֣�ά����������ǳ��Ѿ���
 * 
 * ʹ�����صĺô��ǿ���ǿ����Щ���������еĶ�̬�Ժͷ�����һ���ԡ�
 * ����������ʹ�õĲ�����ͬ������̫���ͬ��������ʹ�Ķ�������˲����׿������ͬ�����ط���֮�������
 * �����ʹ�����ػ�ʹһ�������ϵͳ��ò���Ҫ�ĸ��ӣ�������һЩ���ѷ��ֵĴ���
 * �������ﲻʹ�����ؾͿ�������ؿ�����Щ���ʷ����Ľ����ߣ������һ���Ϻõ�ѡ��
 */
interface Visitor {

//	public void visit(A a);
//	public void visit(B b);
//	public void visit(C c);
	
	public void visitA(A a);

	public void visitB(B b);

	public void visitC(C c);
}

interface Visitable {

	public void accept(Visitor visitor);
}

class A implements Visitable {

	@Override
	public void accept(Visitor visitor) {
	}
}

class B implements Visitable {

	@Override
	public void accept(Visitor visitor) {
	}
}

class C implements Visitable {

	@Override
	public void accept(Visitor visitor) {
	}
}