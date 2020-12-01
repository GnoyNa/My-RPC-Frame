package com.yangke.test.server;

import com.yangke.rpc.api.HelloObject;
import com.yangke.rpc.api.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class HelloServiceImpl implements HelloService {

    private static final Logger logger = LoggerFactory.getLogger(HelloServiceImpl.class);

    // 返回一个字符串进行测试
    @Override
    public String hello(HelloObject object) {
        logger.info("接收到：{}",object.getMessage());
        return "这是调用的返回值，id=" + object.getId();
    }
}
