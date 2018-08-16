package zhijian.client;

import java.io.IOException;
import java.net.Socket;
import java.util.concurrent.ConcurrentLinkedQueue;

import zhijian.handler.RequestHandler;
import zhijian.handler.ResponseHandler;
import zhijian.model.Message;

public class Client {
	private Socket connetion;
	private RequestHandler reqHandler;
	private ResponseHandler repHandler;
	
	//TODO
	private ConcurrentLinkedQueue<Message> requestMsg = new ConcurrentLinkedQueue<>();
	private ConcurrentLinkedQueue<Message> responseMsg = new ConcurrentLinkedQueue<>();
	
	public Client(Socket connection){
		this.connetion = connection;
		this.reqHandler = new RequestHandler(this);
		this.repHandler = new ResponseHandler(this);
	}
	
	public Socket getConnection(){
		return this.connetion;
	}
	
	public void addRequestMsg(Message msg){
		this.requestMsg.offer(msg);
	}
	
	public Message pollRequestMsg(){
		if(hasRequestMsg()){
			return this.requestMsg.poll();
		}else{
			return null;
		}
	}
	
	public boolean hasRequestMsg(){
		return this.requestMsg.isEmpty();
	}

	public void addResponseMsg(Message msg){
		this.responseMsg.add(msg);
	}
	
	public boolean hasResponseMsg(){
		return this.responseMsg.isEmpty();
	}
	
	public Message pollResponseMsg(){
		if(hasResponseMsg()){
			return this.responseMsg.poll();
		}else{
			return null;
		}
	}
	
	public void start(){
		new Thread(reqHandler).start();
		new Thread(repHandler).start();
	}
	
	public void close(){
		try {
			this.connetion.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
