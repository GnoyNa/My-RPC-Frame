package com.yangke.test.client;

import com.yangke.rpc.api.HelloObject;
import com.yangke.rpc.api.HelloService;
import com.yangke.rpc.client.RpcClientProxy;
import com.yangke.rpc.socket.SocketClient;

/**
 * Socket方式远程方法调用的消费者（客户端）
 */
public class SocketTestClient {

    public static void main(String[] args) {
        SocketClient client = new SocketClient("127.0.0.1", 9000);
        RpcClientProxy proxy = new RpcClientProxy(client);
        HelloService helloService = proxy.getProxy(HelloService.class);
        HelloObject object = new HelloObject(12, "This is a message");
        String res = helloService.hello(object);
        System.out.println(res);
    }

}
