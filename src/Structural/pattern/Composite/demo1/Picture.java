/**
 * 
 */
package pattern.Composite.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * Picture类
 * <p>
 * 是直线、圆、矩形等图形的组合类
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-11
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
	 * 增加一个新图形
	 */
	public void add(Graphics graphics) {
		getGraphics().add(graphics);
	}

	/**
	 * 删除指定图形
	 */
	public void remove(Graphics graphics) {
		getGraphics().remove(graphics);
	}

	/**
	 * 返回指定索引图形
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
