/**
 * 
 */
package pattern.Proxy.demo;

import java.util.HashMap;
import java.util.Map;

/**
 * ����ʹ����־
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-23
 */
public class UsageLogger {

	/** �û�ID_����ʹ�ô���_Map(������Ϊʾ�����ݿ�ʹ��) */
	private static Map<String,Integer> userid_usage_map = new HashMap<String,Integer>();
	
	private String userid;
	
	public UsageLogger(String userid){
		this.userid = userid;
	}
	
	/**
	 * ��¼��־
	 */
	public void log() {
		Integer counter = userid_usage_map.get(userid);
		if (counter == null) {
			userid_usage_map.put(userid, 1);
		} else {
			userid_usage_map.put(userid, counter + 1);
		}
		System.out.println(userid + ",this is the "
				+ userid_usage_map.get(userid) + " time you using search.");
	}
}