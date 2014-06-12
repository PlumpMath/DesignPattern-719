/**
 * 
 */
package pattern.Bridge;

/**
 * ���󻯽�ɫ
 * <p>
 * ���󻯸����Ķ��壬������һ����ʵ�ֻ���������á�
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-26
 */
public abstract class Abstraction {
	
	// ʵ�ֻ�����
	private Implementor implementor;

	public Abstraction(Implementor implementor) {
		this.implementor = implementor;
	}

	public void setImplementor(Implementor implementor) {
		this.implementor = implementor;
	}

	private Implementor getImplementor() {
		return implementor;
	}

	/**
	 * ĳ��ҵ�񷽷�����Ҫί�ɸ�ʵ�ֻ�����
	 */
	public void operation() {
		getImplementor().operationImpl();
	}
	
	/**
	 * ĳ��ҵ�񷽷�������ʵ�֣�����Ҫʵ�ֻ�����Ĳ���
	 * <p>
	 * һ����ԣ�ʵ�ֻ���ɫ�е�ÿһ��������Ӧ����һ�����󻯽�ɫ�е�ĳһ��������֮���Ӧ��
	 * ���ǣ���������һ��������֮�����󻯽�ɫ�Ľӿڱ�ʵ�ֻ���ɫ�Ľӿڿ�
	 * ���󻯽�ɫ�����ṩ��ʵ�ֻ���ɫ��صķ���֮�⣬���п����ṩ��������ҵ������
	 * ��ʵ�ֻ���ɫ��������Ϊʵ�ֳ����ɫ�������Ϊ�����ڡ�
	 */
	public void printOperation(){
		System.out.println("Abstraction.printOperation()");
	}
}