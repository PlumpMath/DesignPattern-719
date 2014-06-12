/**
 * 
 */
package pattern.SimpleFactory.more;

/**
 * 4.�����Ʒ��ɫ���ǹ���(������ɫ�ͳ����Ʒ��ɫ�ϲ�)
 * <p>
 * ������ɫ�����ɳ����Ʒ��ɫ���ݣ�һ�������Ʒ��ͬʱ������Ĺ���
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-2-4
 */
public class AbsProductIsFactory {

}

/**
 * ʹ��Sport�Ŀͻ���
 */
class SportClient {

	static void consume() {
		Sport.getInstance("football");
		Sport.getInstance("basketball");
	}
}

/**
 * �˶���
 */
abstract class Sport {

	static Sport getInstance(String which) {
		if (which.equalsIgnoreCase("football")) {
			return new Football();
		} else if (which.equalsIgnoreCase("basketball")) {
			return new Basketball();
		}
		return null;
	}
}

/**
 * ������
 */
class Football extends Sport {
}

/**
 * ������
 */
class Basketball extends Sport {
}