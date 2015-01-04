/**
 * 
 */
package pattern.Proxy.more;

/**
 * ���ʱ���(Protection Access)������ʾ
 * <p>
 * ���ƶ�һ������ķ��ʣ������Ҫ�����Ը���ͬ���û��ṩ��ͬ�����ʹ��Ȩ�ޡ�
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-22
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
 * �ļ��������ӿ�
 */
interface IFileManager {

	/**
	 * ɾ��ָ�����ļ�
	 */
	public void delete(String filePath);

	/**
	 * ɾ�����е��ļ�
	 */
	public void deleteAll() throws Exception;
}

/**
 * �ļ�������
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
 * �ļ�����������������
 * <p>
 * ����Ȩ��Permission���ƶ������ļ��������ķ���
 */
class FileManagerProtectionAccessProxy implements IFileManager {

	private FileManager fileManager;// �������ļ�������

	private Permission permission;

	public FileManagerProtectionAccessProxy(Permission permission) {
		this.fileManager = new FileManager();
		this.permission = permission;
	}

	/**
	 * �κ�Ȩ�޶�����ɾ��ָ�����ļ�
	 */
	@Override
	public void delete(String filePath) {
		fileManager.delete(filePath);
	}

	/**
	 * ֻ�й���ԱȨ�޲���ɾ�����е��ļ�
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
 * Ȩ��ö��
 */
enum Permission {

	ADMIN/** ����Ա */, USER/** �û� */
}

/**
 * δ��Ȩ�쳣
 */
class UnauthorizationException extends Exception {

	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		return "�û�δ����Ȩ.";
	}
}