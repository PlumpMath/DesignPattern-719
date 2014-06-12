/**
 * 
 */
package pattern.FactoryMethod.more;

import java.util.ArrayList;
import java.util.List;

/**
 * ��Ʒ�����ѭ��ʹ�ú͵Ǽ�ʽ�Ĺ�������
 * <p>
 * ����������������������൱���ӣ������ĸ����߼���ѭ��ʹ�ò�Ʒ����
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-2-26
 */
public class ProductRegister {

}

class WCClient {

	private static WCFactory maleWCFactory;
	private static WCFactory femaleWCFactory;
	
	static void consume() {
		maleWCFactory = new MaleWCFactory();
		maleWCFactory.factory();
		maleWCFactory.factory();
		maleWCFactory.factory();
		femaleWCFactory = new FemaleWCFactory();
		femaleWCFactory.factory();
		femaleWCFactory.factory();
		femaleWCFactory.factory();
	}
}

interface WCFactory {

	public WC factory();
}
/**
 * �����Ʒ����������ڲ�״̬�����Ļ�����ô����ÿһ�����ܵ��ڲ�״̬����������Ҫһ����Ʒʵ����
 * ��ʱ�򹤳��������Ҫ���Ѿ��������Ĳ�Ʒ����Ǽǵ�һ���ۼ����棬
 * Ȼ����ݿͻ���������Ĳ�Ʒ״̬����ۼ����в�ѯ��
 * ����ۼ����������Ĳ�Ʒ������ô��ֱ�ӽ������Ʒ���󷵻����ͻ��ˣ�
 * ����ۼ���û�������Ĳ�Ʒ������ô�ʹ���һ���µ�����Ҫ��Ĳ�Ʒ����
 * Ȼ���������Ǽǵ��ۼ��У��ٷ������ͻ��ˡ�
 * */
class MaleWCFactory implements WCFactory {

	private static List<WC> MALE_WC_LIST = new ArrayList<WC>();

	static {
		// ֻ�ṩ5���в���
		for (int i = 0; i < 5; i++) {
			MALE_WC_LIST.add(new MaleWC());
		}
	}

	public WC factory() {
		for (WC wc : MALE_WC_LIST) {
			if (!wc.isInUse()) {
				return wc;
			}
		}
		throw new RuntimeException("All Male WC are in use.");
	}
}

class FemaleWCFactory implements WCFactory {

	private static List<WC> FEMALE_WC = new ArrayList<WC>();

	static {
		//ֻ�ṩ10��Ů����
		for (int i = 0; i < 10; i++) {
			FEMALE_WC.add(new FemaleWC());
		}
	}

	public WC factory() {
		for (WC wc : FEMALE_WC) {
			if (!wc.isInUse()) {
				return wc;
			}
		}
		throw new RuntimeException("All Female WC are in use.");
	}
}

interface WC {

	public boolean isInUse();

	public void enter();
}

abstract class AbstractWC implements WC {

	private boolean inUse;

	public boolean isInUse() {
		return inUse;
	}

	public void enter() {
		inUse = true;
	}
}

class MaleWC extends AbstractWC {

	public void enter() {
		super.enter();
		System.out.println("This is Male WC.");
	}
}

class FemaleWC extends AbstractWC {

	public void enter() {
		super.enter();
		System.out.println("This is Female WC.");
	}
}