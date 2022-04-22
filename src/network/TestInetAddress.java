package network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestInetAddress {

	public static void main(String[] args) {
		//cmd ipconfig
		InetAddress localhost;
		try {
			localhost = InetAddress.getLocalHost();
			System.out.printf("IP:%s%n",localhost.getHostAddress());
			System.out.printf("hostname:%s%n",localhost.getHostName());
			
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		
		

	}

}
