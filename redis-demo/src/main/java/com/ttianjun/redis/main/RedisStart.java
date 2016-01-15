package com.ttianjun.redis.main;

import com.ttianjun.redis.dao.RedisDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @user keeley
 * @date 16/1/15
 */
public class RedisStart {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        context.start();

        RedisDao redisDao = context.getBean("redisDao", RedisDao.class);
        redisDao.set("test", "test-----tianjun...");
        System.out.println(redisDao.get("test"));
    }//test-----ming...

}
