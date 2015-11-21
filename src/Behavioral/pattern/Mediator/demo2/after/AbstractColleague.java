/**
 * 
 */
package pattern.Mediator.demo2.after;

/**
 * 抽象同事类
 * <p>
 * 抽象同事类角色
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-8
 */
public abstract class AbstractColleague {

	// 调停者
	private IMediator mediator;

	public AbstractColleague(IMediator mediator) {
		this.mediator = mediator;
	}

	protected IMediator getMediator() {
		return mediator;
	}
}
