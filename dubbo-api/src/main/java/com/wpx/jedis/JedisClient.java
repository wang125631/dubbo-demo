package com.wpx.jedis;

import java.util.List;

/**
 * Jedis 常用操作
 * 
 * @author wangpx
 */
public interface JedisClient {

	// 字符串存取
	String set(String key, String value);

	String get(String key);

	// 判断key是否存在
	Boolean exists(String key);

	// 设置过期时间
	Long expire(String key, int seconds);

	// 查看过期时间
	Long ttl(String key);

	// 自增
	Long incr(String key);
	//hash数据结构的 存 取 删除 判断
	Long hset(String key, String field, String value);

	String hget(String key, String field);

	Long hdel(String key, String... field);

	Boolean hexists(String key, String field);

	//通过key获取hash值的集合
	List<String> hvals(String key);

	Long del(String key);

}
