/**
 * 
 */
package pattern.Flyweight.demo1;

/**
 * 数据库连接实现类
 * <p>
 * 具体享元对象
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-8-3
 */
public class DBConnectionImpl implements DBConnection {

	private int no;// 编号

	private boolean isInUse;// 是否正被使用

	DBConnectionImpl(int no) {
		this.no = no;
	}

	@Override
	public void connect(String address) {
		System.out.println("connection " + no + " connects " + address + " ...");
		this.isInUse = true;
	}

	@Override
	public void release() {
		System.out.println("connection " + no + " released.");
		this.isInUse = false;
	}

	public boolean isInUse() {
		return isInUse;
	}
}