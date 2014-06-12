/**
 * 
 */
package pattern.Composite.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * Picture��
 * <p>
 * ��ֱ�ߡ�Բ�����ε�ͼ�ε������
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-11
 */
public class Picture implements Graphics {

	private List<Graphics> graphics;

	@Override
	public void draw() {
		for (Graphics graphics : getGraphics()) {
			graphics.draw();
		}
	}

	/**
	 * ����һ����ͼ��
	 */
	public void add(Graphics graphics) {
		getGraphics().add(graphics);
	}

	/**
	 * ɾ��ָ��ͼ��
	 */
	public void remove(Graphics graphics) {
		getGraphics().remove(graphics);
	}

	/**
	 * ����ָ������ͼ��
	 */
	public Graphics getChild(int index) {
		return getGraphics().get(index);
	}

	private List<Graphics> getGraphics() {
		if (graphics == null) {
			graphics = new ArrayList<Graphics>();
		}
		return graphics;
	}
}