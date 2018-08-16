package zhijian.handler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import zhijian.client.Client;
import zhijian.model.Message;

public class ResponseHandler implements Runnable{

	private Client client;
	
	public ResponseHandler(Client client){
		this.client = client;
	}
	
	@Override
	public void run() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(client.getConnection().getInputStream()));
			
			while(true){
				String msg = "";
				if(!(msg = br.readLine()).isEmpty()){
					client.addResponseMsg(new Message(msg));
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
