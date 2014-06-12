/**
 * 
 */
package pattern.Mediator.demo3.after;

/**
 * ����ͬ����
 * <p>
 * ����ͬ�����ɫ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-8
 */
public abstract class AbstractColleague {

	// ��ͣ��
	private IMediator mediator;

	public AbstractColleague(IMediator mediator) {
		this.mediator = mediator;
	}

	protected IMediator getMediator() {
		return mediator;
	}
}