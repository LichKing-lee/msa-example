package com.yong.msa2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.yong.msa2.component.Sender;

@SpringBootApplication
public class Msa2Application implements CommandLineRunner {
	private Sender sender;

	public Msa2Application(Sender sender) {
		this.sender = sender;
	}

	public static void main(String[] args) {
		SpringApplication.run(Msa2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		sender.send("hello message");
	}
}
