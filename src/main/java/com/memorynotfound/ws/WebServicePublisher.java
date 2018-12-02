package com.memorynotfound.ws;

import javax.xml.ws.Endpoint;

public class WebServicePublisher {

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8888/service/order", new OrderServiceImpl());
        Endpoint.publish("http://localhost:8888/bobby/login", new LoginServiceImpl());
        Endpoint.publish("http://localhost:8888/service/emp", new EmployeeServiceImpl());
        System.out.println("WS is up and running");
    }

}
