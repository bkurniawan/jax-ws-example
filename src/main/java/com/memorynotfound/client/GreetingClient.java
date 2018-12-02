package com.memorynotfound.client;

import com.memorynotfound.ws.OrderService;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;
import java.util.Arrays;

public class GreetingClient {

    public static void main(String[] args) throws Exception {

        URL wsdlUrl = new URL("http://localhost:8888/service/order?wsdl");
        QName qname = new QName("http://ws.memorynotfound.com/", "OrderServiceImplService");
        Service service = Service.create(wsdlUrl, qname);
        OrderService orderService = service.getPort(OrderService.class);

        System.out.println(Arrays.toString(orderService.getOrders()));
        System.out.println("Order completed: " + orderService.addOrder("Mother Board"));
        
        
        System.out.println("https://memorynotfound.com/jax-ws-soap-web-service-example/");
        
    }
}
