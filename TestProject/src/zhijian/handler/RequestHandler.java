package zhijian.handler;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

import zhijian.client.Client;
import zhijian.model.Message;

public class RequestHandler implements Runnable{

	private Client client;
	
	public RequestHandler(Client client) {
		this.client = client;
	}
	
	@Override
	public void run() {
		try {
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(client.getConnection().getOutputStream()));
			
			while(client.hasRequestMsg()){
				Message msg = client.pollRequestMsg();
			
				bw.write(msg.getMsg());
				bw.flush();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
