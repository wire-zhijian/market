package zhijian.server;

import java.io.IOException;
import java.net.ServerSocket;

public class Server {
	public final static int PROT = 8888;
	private static ServerSocket _serverSocket;
	private Server(){}
	
	private static void newInstance() throws IOException{
		_serverSocket = new ServerSocket(PROT);
	}
	
	public static ServerSocket getInstance(){
		return _serverSocket;
	}
	
	public static void main(String[] args) {
		
	}
}
