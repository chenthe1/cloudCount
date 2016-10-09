package com.cloudCount.platform.mq.springPubSubDomain;

import java.io.Serializable;
import java.util.Date;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.ObjectMessage;
import javax.jms.Session;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

public class SimpleJMSSender {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext-send.xml");
		
		JmsTemplate jmsTemplate = (JmsTemplate) ctx.getBean("myJmsTemplate");
		for (int i = 0; i < 10; i++) {
			jmsTemplate.send(new MessageCreator() {
				public Message createMessage(Session session) throws JMSException {
					ObjectMessage msg = session.createObjectMessage();
					// 设置消息属性
					msg.setStringProperty("phrCode", "C001");
					msg.setObject(new Body());
					return msg;
				}
			});
		}
	}
}

class Body implements Serializable {
	private static final long serialVersionUID = 4448416827192038975L;
	String hand = "aa";
	int siz = 176;
	Date date = new Date();
}
