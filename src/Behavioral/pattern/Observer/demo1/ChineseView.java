/**
 * 
 */
package pattern.Observer.demo1;

/**
 * ������ͼ
 * <p>
 * ����۲��߽�ɫ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-5-10
 */
public class ChineseView implements View {

	@Override
	public void update(Model model) {
		StringModel smodel = (StringModel) model;
		System.out.println("���ģ�" + smodel.getContent());
	}
}