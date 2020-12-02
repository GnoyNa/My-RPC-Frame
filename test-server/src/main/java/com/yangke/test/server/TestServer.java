package com.yangke.test.server;

import com.yangke.rpc.api.HelloService;
import com.yangke.rpc.registry.DefaultServiceRegistry;
import com.yangke.rpc.registry.ServiceRegistry;
import com.yangke.rpc.server.RpcServer;

public class TestServer {

    public static void main(String[] args) {
        HelloService helloService = new HelloServiceImpl();
        ServiceRegistry serviceRegistry = new DefaultServiceRegistry();
        serviceRegistry.register(helloService);
        RpcServer rpcServer = new RpcServer(serviceRegistry);
        rpcServer.start(9000);
    }

}
