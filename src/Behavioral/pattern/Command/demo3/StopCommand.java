/**
 * 
 */
package pattern.Command.demo3;

/**
 * Stop停止命令
 * <p>
 * 具体命令(ConcreteCommand)角色
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-4
 */
public class StopCommand extends AbstractCommand {

	public StopCommand(AudioPlayer player) {
		super(player);
	}

	@Override
	public void execute() {
		getPlayer().stopPlaying();
	}
}