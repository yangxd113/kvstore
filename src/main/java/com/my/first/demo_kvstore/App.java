package com.my.first.demo_kvstore;

import redis.clients.jedis.Jedis;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    try {
    	System.out.println( "进入jedis" );
        String host = "10.124.157.143";//控制台显示访问地址
        int port = 6379;
        Jedis jedis = new Jedis(host, port);
        //鉴权信息
        jedis.auth("5672b4806acf422b:Dasaigs123");//password
        String key = "key2";
        String value = "zheshi test 2";
        //select db默认为0
        jedis.select(1);
        //set一个key
        jedis.set(key, value);
        System.out.println("Set Key " + key + " Value: " + value);
        //get 设置进去的key
        String getvalue = jedis.get(key);
        System.out.println("Get Key " + key + " ReturnValue: " + getvalue);
        jedis.quit();
        jedis.close();
   } 
   catch (Exception e) {
    e.printStackTrace();
   }
    }
}
