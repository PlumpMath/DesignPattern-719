/**
 * 
 */
package pattern.SimpleFactory.more;

/**
 * ��Ʒ�����ѭ��ʹ�ú͵Ǽ�ʽ�Ĺ�������
 * <p>
 * ��ǰ��ĳ���ʾ���й����������Ǽ򵥵ص��ò�Ʒ��Ĺ��췽��������һ���µ�ʵ����
 * Ȼ�����ʵ���ṩ���ͻ��ˣ�����ʵ�������й���������������������൱���ӡ�
 * <p>
 * ����ģʽ�Ͷ���ģʽ�ǽ����ڼ򵥹���ģʽ�Ļ���֮�ϵģ�
 * �������Ƕ�Ҫ�󹤳���������������߼����Ա���ѭ��ʹ�ò�Ʒ��ʵ����
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-2-26
 */
public class ProductRegister {

}

class WCClient {

	static void consume() {
		WCFactory.factory("male");
		WCFactory.factory("female");
		WCFactory.factory("3male");
	}
}
/**
 * �ںܶ�����£���Ʒ�������ѭ��ʹ�á�
 * ������������ѭ��ʹ���Ѿ����������Ķ��󣬶�����ÿһ�ζ������µĲ�Ʒ����
 * ������������ͨ���Ǽ����������Ĳ�Ʒ�������ﵽѭ��ʹ�ò�Ʒ�����Ŀ�ġ�
 */
class WCFactory {

	/*
	 * ���������������ѭ��ʹ��ͬһ����Ʒ������ô��������������ʹ��һ���������洢�����Ʒ����
	 * ÿһ�οͻ��˵��ù�������ʱ���������������ṩ��ͬһ������
	 * �ڵ���ģʽ�о����������������ṩһ����̬����������������ṩһ��Ψһ�ĵ�����ʵ���� 
	 * <p>
	 * �������������Զѭ��ʹ�ù̶���Ŀ��һЩ��Ʒ���󣬶�����Щ��Ʒ�������Ŀ������Ļ���
	 * ����ʹ��һЩ˽�����Դ洢����Щ��Ʒ��������á�
	 * �෴�������������ʹ����Ŀ��ȷ��������Ŀ�ϴ��һЩ��Ʒ����Ļ���
	 * ʹ�����Ա����洢����Щ��Ʒ��������þͲ������ˡ���ʱ���Ӧ��ʹ�þۼ��洢��Щ��Ʒ����ʵ����
	 * <p>
	 * ����ʹ����һ�ַ�����������������������ѭ��ʹ�����������Ĳ�Ʒ����
	 * ѭ�����߼������ǻ�����Щ��Ʒ����ڲ�״̬������ĳһ��״̬�Ĳ�Ʒ����ֻ����һ����
	 * ��������Ҫ������һ״̬�ϵĲ�Ʒ����Ŀͻ��˹�����һʵ����
	 */
	private static WC MALE_WC = new MaleWC();
	private static WC FEMALE_WC = new FemaleWC();

	static WC factory(String sex) {
		if ("male".equalsIgnoreCase(sex)) {
			return MALE_WC;
		} else if ("female".equalsIgnoreCase(sex)) {
			return FEMALE_WC;
		} else {
			throw new RuntimeException("Is there another sex?");
		}
	}
}

interface WC {

	public void enter();
}

class MaleWC implements WC {

	public void enter() {
		System.out.println("This is Male WC.");
	}
}

class FemaleWC implements WC {

	public void enter() {
		System.out.println("This is Female WC.");
	}
}