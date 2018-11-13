package com.yong.msa1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class HomeController {
	@GetMapping("/")
	public Mono<Person> home() {
		return Mono.just(new Person(30, "LichKing"));
	}

	public static class Person {
		private int age;
		private String name;

		public Person(int age, String name) {
			this.age = age;
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public String getName() {
			return name;
		}
	}
}
