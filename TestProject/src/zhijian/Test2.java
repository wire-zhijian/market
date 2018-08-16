package zhijian;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket("127.0.0.1", Test1.PROT);
		
	        Scanner sc = new Scanner(System.in);
	        
	        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
	        
	        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

	        boolean flag = false;

	        while (!flag) {

//	            System.out.println("请输入正方形的边长:");
//	            double length = sc.nextDouble();
//
//	            dos.writeDouble(length);
//	            dos.flush();
//
//	            double area = dis.readDouble();
//
//	            System.out.println("服务器返回的计算面积为:" + area);
//
//	            while (true) {
//
//	                System.out.println("继续计算？(Y/N)");
//
//	                String str = sc.next();
//
//	                if (str.equalsIgnoreCase("N")) {
//	                    dos.writeInt(0);
//	                    dos.flush();
//	                    flag = true;
//	                    break;
//	                } else if (str.equalsIgnoreCase("Y")) {
//	                    dos.writeInt(1);
//	                    dos.flush();
//	                    break;
//	                }
//	            }
//	        	System.out.println("请输入想说什么:");
	        	if(sc.hasNext()){
//	        		System.out.println(sc.nextByte());
	        		bw.write(sc.nextLine() + "\n");
	        		bw.flush();
	        	}
	        	
	        	if(br.read() > 0){
	        		System.out.println("【主机说】：" + br.readLine());
	        	}
	        	
//	        	dos.writeByte(sc.nextByte());
	        }

	        socket.close();
	}
}
