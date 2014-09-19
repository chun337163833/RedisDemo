package com.languang.redis;

import redis.clients.jedis.Jedis;

/**
 * Created by 郭宁 on 2014/9/18.
 */
public class RedisClient {
    public static Jedis jedis = null;

    public static Jedis getClient(){
        if(jedis == null){
            jedis = new Jedis(Constant.HOST, Constant.PORT);
        }
        return jedis;
    }
}
