/**
 * 
 */
package pattern.Builder;

/**
 * �ͻ��˳�����
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-3-16
 */
public class Client {

	/**
	 * �ͻ��˸��𴴽������ߺ;��彨���߶���Ȼ�󣬿ͻ��Ѿ��彨���߶��󽻸������ߡ�
	 * �ͻ�һ�����£������߲������彨���ߣ���ʼ������Ʒ��
	 * ���彨����ÿ�ӵ������ߵ�һ��ָ��㰴��ָ�����Ʒ������һ�������
	 * ����Ʒ��ɺ󣬽����߰Ѳ�Ʒ�������ͻ��ˡ�
	 * ��Ȼ�ͻ���ȷʵ���𴴽����彨���߶��󣬵��ǲ������彨���ߵ�����ȴ�����ڵ����߶���ġ�
	 * �Ѵ������彨���߶�������񽻸��ͻ��˶����ǵ����߶�����Ϊ�˽������߶�����
	 * ���彨���߶������ϱ�ɶ�̬�ģ��Ӷ�ʹ�����߶�����Բ����������彨���߶����е��κ�һ����
	 */
	public static void main(String[] args) {
		ConcreteBuilder builder = new ConcreteBuilder();
		Director diretor = new Director(builder);
		diretor.construct();
		Product product = builder.retrieve();
		System.out.println(product.toString());
	}
}