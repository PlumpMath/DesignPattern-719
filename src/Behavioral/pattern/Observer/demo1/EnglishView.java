/**
 * 
 */
package pattern.Observer.demo1;

/**
 * Ӣ����ͼ
 * <p>
 * ����۲��߽�ɫ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-5-10
 */
public class EnglishView implements View {

	@Override
	public void update(Model model) {
		StringModel smodel = (StringModel) model;
		System.out.println("English��" + smodel.getContent());
	}
}