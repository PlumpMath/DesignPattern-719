/**
 * 
 */
package pattern.Proxy.more;

/**
 * 访问保护(Protection Access)代理演示
 * <p>
 * 控制对一个对象的访问，如果需要，可以给不同的用户提供不同级别的使用权限。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-22
 */
public class ProtectionAccessProxyDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			IFileManager filemanager = new FileManagerProtectionAccessProxy(
					Permission.ADMIN);
			filemanager.deleteAll();
			filemanager = new FileManagerProtectionAccessProxy(Permission.USER);
			filemanager.deleteAll();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}

/**
 * 文件管理器接口
 */
interface IFileManager {

	/**
	 * 删除指定的文件
	 */
	public void delete(String filePath);

	/**
	 * 删除所有的文件
	 */
	public void deleteAll() throws Exception;
}

/**
 * 文件管理器
 */
class FileManager implements IFileManager {

	@Override
	public void delete(String filePath) {
		System.out.println("delete file:" + filePath);
	}

	@Override
	public void deleteAll() throws Exception {
		System.out.println("delete all files.");
	}
}

/**
 * 文件管理器保护代理类
 * <p>
 * 根据权限Permission控制对真正文件管理器的访问
 */
class FileManagerProtectionAccessProxy implements IFileManager {

	private FileManager fileManager;// 真正的文件管理器

	private Permission permission;

	public FileManagerProtectionAccessProxy(Permission permission) {
		this.fileManager = new FileManager();
		this.permission = permission;
	}

	/**
	 * 任何权限都可以删除指定的文件
	 */
	@Override
	public void delete(String filePath) {
		fileManager.delete(filePath);
	}

	/**
	 * 只有管理员权限才能删除所有的文件
	 */
	@Override
	public void deleteAll() throws Exception {
		if (permission == Permission.ADMIN) {
			fileManager.deleteAll();
		} else {
			throw new UnauthorizationException();
		}
	}
}

/**
 * 权限枚举
 */
enum Permission {

	ADMIN/** 管理员 */, USER/** 用户 */
}

/**
 * 未授权异常
 */
class UnauthorizationException extends Exception {

	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		return "用户未被授权.";
	}
}
