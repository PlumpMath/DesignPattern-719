/**
 * 
 */
package pattern.Composite.safe;

/**
 * ��Ҷ����(Leaf)��ɫ
 * <p>
 * ��Ҷ������û���¼��Ӷ���Ķ��󣬶�����μ���ϵ�ԭʼ�������Ϊ��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-11
 */
public class Leaf implements Component {

	@Override
	public void operation() {
		System.out.println("Leaf operation.");
	}
}