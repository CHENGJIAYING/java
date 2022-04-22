package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.Scanner;

public class Server {

	public static void main(String[] args) {
		System.out.println("Server啟動");
		try (  ServerSocket ssocket = new ServerSocket(8080);  
			Socket socket = ssocket.accept();//代表連線的物件
				//假設雙方都是UTF8編碼,讀取讀一行
				InputStream is = socket.getInputStream();
				InputStreamReader isr = new InputStreamReader(is,"UTF8");
				BufferedReader br = new BufferedReader(isr);
				OutputStream os = socket.getOutputStream();
				OutputStreamWriter osw = new OutputStreamWriter(os,"UTF8");
				){
				InetSocketAddress remote = (InetSocketAddress)socket.getRemoteSocketAddress();
				System.out.printf("Client: %s%n",remote.getHostName());
				
				Scanner scanner = new Scanner(System.in);
				Thread receivingThread = new Thread(new Runnable() {
					
					@Override
					public void run() {
						// TODO Auto-generated method stub
						String line ;
						try {
							while ((line = br.readLine())!= null ) {
								System.out.printf("接收到:%s%n",line);
						
							}
						}catch (IOException e) {
							e.printStackTrace();
						}
					}
				});
				receivingThread.setDaemon(true);
				receivingThread.start();
				
					String response = scanner.nextLine();
					while (response != null) {
						osw.write(response+"\r\n");
						osw.flush();
						response =scanner.nextLine();
						
					}
				
			
			
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
		

	}

}
