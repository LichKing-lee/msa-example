package com.yong.msa2.component;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitMessagingTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Sender {
	private RabbitMessagingTemplate template;

	public Sender(RabbitMessagingTemplate template) {
		this.template = template;
	}

	@Bean
	public Queue queue() {
		return new Queue("TestQ", false);
	}

	public void send(String message) {
		template.convertAndSend("TestQ", message);
	}
}
