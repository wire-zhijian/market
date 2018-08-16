package zhijian.handler;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import zhijian.client.Client;
import zhijian.model.Message;
import zhijian.server.Server;

public class LoginHandler implements Runnable{

	@Override
	public void run() {
		try {
			ServerSocket serverSocket = Server.getInstance();
	
			Scanner sc = new Scanner(System.in);
			
			while(true){
				Socket socket = serverSocket.accept();
				
				Client client = new Client(socket);
				
				client.start();
			
				if(client.hasResponseMsg()){
					System.out.println(client.pollResponseMsg());
				}
				
				if(sc.hasNext()){
					client.addRequestMsg(new Message(sc.nextLine()));
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
