/**
 * 
 */
package pattern.Multiton.demo;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;

/**
 * ������Դ�Ķ���ģʽʵ��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-3-12
 */
public class LanguageResourceDemo {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(LanguageResource.getInstance("en","US").getLocaleString("USD"));
		System.out.println(LanguageResource.getInstance("zh","CN").getLocaleString("USD"));
		System.out.println(LanguageResource.getInstance("en","US").getLocaleString("JPY"));
		System.out.println(LanguageResource.getInstance("zh","CN").getLocaleString("JPY"));
	}
}

class LanguageResource {
	
	/** �����ļ�����(������·��)ǰ׺ */
	private static final String FILE_NAME = "pattern/Multiton/demo/res";
	
	private Locale locale;
	private ResourceBundle rb;
	
	// ʵ������Map
	private static Map<String,LanguageResource> instancesMap = new HashMap<String,LanguageResource>();

	private LanguageResource(String language,String region){
		this.locale = new Locale(language,region);
		this.rb = ResourceBundle.getBundle(FILE_NAME, locale);
	}
	
	/**
	 * �������Ժ͵�������һ��������Դ����ʵ��
	 */
	public synchronized static LanguageResource getInstance(String language,
			String region) {
		String localeCode = getLocaleCode(language, region);
		LanguageResource instance = instancesMap.get(localeCode);
		if (instance == null) {
			instance = new LanguageResource(language, region);
			instancesMap.put(localeCode, instance);
		}
		return instance;
	}
	
	/**
	 * ���ض����ļ��в��������ֵ
	 */
	public String getLocaleString(String code){
		return rb.getString(code);
	}
	
	private static String getLocaleCode(String language,String region){
		return language + "_" + region;
	}
}