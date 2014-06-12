/**
 * 
 */
package pattern.ChainOfResponsibility.demo2;

/**
 * 击鼓传花
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-10
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DrumBeater beater = new DrumBeater();
		// A->B->C->D->E->A 环形责任链
		Player aplayer = new Player("A");
		aplayer.setDrumBeater(beater);
		aplayer.setNextPlayer(new Player("B", new Player("C", new Player("D",
				new Player("E", aplayer)))));
		// 开始击鼓
		beater.startBeating();
		// A开始传花
		aplayer.handle("花");
	}
}