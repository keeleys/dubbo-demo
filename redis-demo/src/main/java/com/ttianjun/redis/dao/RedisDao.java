package com.ttianjun.redis.dao;

import redis.clients.jedis.ShardedJedis;
import redis.clients.jedis.ShardedJedisPool;

/**
 * @user keeley
 * @date 16/1/15
 */
public class RedisDao {
    private ShardedJedisPool shardedJedisPool;
    public void set(String key, String value)  {
        ShardedJedis jedis =  shardedJedisPool.getResource();
        jedis.set(key, value);
    }
    public String get(String key)  {
        ShardedJedis jedis =  shardedJedisPool.getResource();
        return jedis.get(key);
    }

    public void setShardedJedisPool(ShardedJedisPool shardedJedisPool) {
        this.shardedJedisPool = shardedJedisPool;
    }
}
