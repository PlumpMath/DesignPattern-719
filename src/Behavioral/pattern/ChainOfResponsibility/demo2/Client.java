/**
 * 
 */
package pattern.ChainOfResponsibility.demo2;

/**
 * ���Ĵ���
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-10
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DrumBeater beater = new DrumBeater();
		// A->B->C->D->E->A ����������
		Player aplayer = new Player("A");
		aplayer.setDrumBeater(beater);
		aplayer.setNextPlayer(new Player("B", new Player("C", new Player("D",
				new Player("E", aplayer)))));
		// ��ʼ����
		beater.startBeating();
		// A��ʼ����
		aplayer.handle("��");
	}
}