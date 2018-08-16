package zhijian;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Test1{

	public final static int PROT = 8889;
	
	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = new ServerSocket(PROT);
//		
		Socket socket = serverSocket.accept();
//	
		System.out.println(socket.getInetAddress() + ":Á´½ÓÏµÍ³");
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		

//		BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
		
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		Scanner sc = new Scanner(System.in);
		
		boolean flag = false;
		while(!flag){
			
			if(br.read() > 0){
				System.out.println(br.readLine());
			}
			
			if(sc.hasNext()){
				bw.write(sc.nextLine() + "\n");
				bw.flush();
			}
		}
		
		sc.close();
		socket.close();
		serverSocket.close();
	}
	
}
