package com.zjy.jms.listener;

import javax.jms.Message;
import javax.jms.MessageListener;

import org.springframework.stereotype.Component;

@Component
public class ConsumerListener implements MessageListener {

	public void onMessage(Message arg0) {
		// TODO Auto-generated method stub
		System.out.println("In onMessage()");
	}

}
