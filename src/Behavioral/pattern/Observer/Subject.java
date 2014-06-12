/**
 * 
 */
package pattern.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * ��������(Subject)��ɫ
 * <p>
 * �����ɫ�����жԹ۲��߶�������ñ�����һ���ۼ�(��List)�У�
 * ÿ�����ⶼ�������κ������Ĺ۲��ߡ�
 * ���������ṩһ���ӿڣ��������Ӻ�ɾ���۲��߶����ֽ������󱻹۲���(Observable)��ɫ��
 * <p>
 * һ������£��������������ɫ�Թ۲��߾ۼ��Ĺ���������ͬ�ģ�
 * Ҳ����˵����Щ�ۼ�����������������о��������ɫ�����еģ�
 * �����Щ������ͬ�ۼ����������Ƶ����������ɫ��ȥ��
 * ����ǹ۲���ģʽ������ͼ�͹۲���ģʽ������ͼ2������
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-5-10
 */
public abstract class Subject {

	private List<Observer> observers;// �۲����б�

	private List<Observer> getObservers() {
		if (observers == null) {
			observers = new ArrayList<Observer>();
		}
		return observers;
	}

	/**
	 * ����һ���۲���
	 */
	public void addObserver(Observer observer) {
		getObservers().add(observer);
	}

	/**
	 * ɾ��һ���۲���
	 */
	public void removeObserver(Observer observer) {
		getObservers().remove(observer);
	}

	/**
	 * ֪ͨ���еĹ۲��ߣ��������Լ������Լ�
	 */
	public void notifyObservers() {
		System.out.println("notify all observers");
		for (Observer observer : getObservers()) {
			observer.update();
		}
	}
}