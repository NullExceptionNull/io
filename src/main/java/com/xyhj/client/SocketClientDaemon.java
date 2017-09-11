package com.xyhj.client;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.CountDownLatch;

/**
 * 模拟20个客户端发送请求,服务器端使用单线程
 */
public class SocketClientDaemon {
    private static final Logger logger = LoggerFactory.getLogger(SocketClientDaemon.class);
    public static void main(String[] args) {
        Integer clientNumber = 20;
        CountDownLatch countDownLatch = new CountDownLatch(clientNumber);
        logger.info("分别开始启动20个客户端");
        for (int index = 0 ; index < clientNumber; index++ ,countDownLatch.countDown()){
            logger.info("index = {} , countDownLatch = {}",index,countDownLatch.getCount());
        }

    }
}
