/**
 * 
 */
package pattern.Proxy.demo;

import java.util.HashMap;
import java.util.Map;

/**
 * 搜索使用日志
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-23
 */
public class UsageLogger {

	/** 用户ID_搜索使用次数_Map(仅仅作为示例数据库使用) */
	private static Map<String,Integer> userid_usage_map = new HashMap<String,Integer>();
	
	private String userid;
	
	public UsageLogger(String userid){
		this.userid = userid;
	}
	
	/**
	 * 记录日志
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