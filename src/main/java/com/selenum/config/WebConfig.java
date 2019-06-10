package com.selenum.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import redis.clients.jedis.JedisPoolConfig;
import redis.clients.jedis.JedisShardInfo;
import redis.clients.jedis.ShardedJedisPool;

import com.using.common.core.cache.redis.RedisLock;

@Configuration
public class WebConfig {

//	@Bean
//	public FilterRegistrationBean accessFilter(@Autowired StringRedisTemplate cache) {
//		AccessFilter filter = new AccessFilter();
//		filter.setCache(cache);
//		FilterRegistrationBean registrationBean = new FilterRegistrationBean();
//		registrationBean.setFilter(filter);
//		registrationBean.setName("AccessFilter");
//		registrationBean.addUrlPatterns("/*");
//		return registrationBean;
//	}
	@Autowired
	private RedisConfig redisConfig;
	
	public JedisPoolConfig jedisPoolConfig() {
		JedisPoolConfig poolConfig = new JedisPoolConfig();
		
		poolConfig.setMaxIdle(redisConfig.getMaxIdle());
		poolConfig.setMaxTotal(redisConfig.getMaxIdle());
		poolConfig.setMaxWaitMillis(redisConfig.getMaxWaitMillis());
//		poolConfig.setTestOnBorrow(redisConfig.isTestOnBorrow());
//		poolConfig.setTestOnReturn(redisConfig.isTestOnReturn());
		return poolConfig;
		
	}
	
	public JedisShardInfo jedisShardInfo() {
		JedisShardInfo jedisShardInfo = new JedisShardInfo(redisConfig.getHost(), redisConfig.getPort(),redisConfig.getTimeout());
		jedisShardInfo.setPassword(redisConfig.getPassword());
		return jedisShardInfo;
	}
	
	public List<JedisShardInfo> getSharedInfo() {

		List<JedisShardInfo> jedisShardInfos = new ArrayList<JedisShardInfo>();
		jedisShardInfos.add(jedisShardInfo());
		return jedisShardInfos;
	}
	
	@Bean
	public ShardedJedisPool jedisPool() {
		ShardedJedisPool jedisPool = new ShardedJedisPool(jedisPoolConfig(), getSharedInfo());
		return jedisPool;
	}
	
	
}
