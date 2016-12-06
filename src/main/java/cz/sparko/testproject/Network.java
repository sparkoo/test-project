package cz.sparko.testproject;

import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

public class Network {
    public static void main(String[] args) throws SocketException {
        Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
        while (networkInterfaces.hasMoreElements()) {
            System.out.println(networkInterfaces.nextElement());
        }
    }
}
