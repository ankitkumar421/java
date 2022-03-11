package com.company;

import java.net.InetAddress;

public class IP {
    public static void main(String[] args) throws Exception{
        InetAddress myIp = InetAddress.getLocalHost();
        System.out.println(myIp.getHostAddress());
    }
}
