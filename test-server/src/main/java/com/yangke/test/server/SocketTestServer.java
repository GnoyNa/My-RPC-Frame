package com.yangke.test.server;

import com.yangke.rpc.api.HelloService;
import com.yangke.rpc.registry.DefaultServiceRegistry;
import com.yangke.rpc.registry.ServiceRegistry;
import com.yangke.rpc.server.RpcServer;
import com.yangke.rpc.socket.SocketServer;

public class SocketTestServer {

    public static void main(String[] args) {
        HelloService helloService = new HelloServiceImpl();
        ServiceRegistry serviceRegistry = new DefaultServiceRegistry();
        serviceRegistry.register(helloService);
        SocketServer socketServer = new SocketServer(serviceRegistry);
        socketServer.start(9000);
    }

}
