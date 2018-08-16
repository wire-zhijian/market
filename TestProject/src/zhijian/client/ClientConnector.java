package zhijian.client;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import zhijian.model.Message;
import zhijian.server.Server;

public class ClientConnector {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket("127.0.0.1", Server.PROT);
	
		Client client = new Client(socket);
		
		client.start();
		
		Scanner sc = new Scanner(System.in);
		
		while(true){
			if(client.hasResponseMsg()){
				System.out.println(client.pollResponseMsg());
			}
			
			if(sc.hasNext()){
				client.addRequestMsg(new Message(sc.nextLine()));
			}
		}
	}
}
