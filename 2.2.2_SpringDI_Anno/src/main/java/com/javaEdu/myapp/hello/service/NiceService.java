package com.javaEdu.myapp.hello.service;

import org.springframework.stereotype.Service;

@Service
public class NiceService implements IHelloService {

	@Override
	public String sayHello(String name) {
		System.out.println("NeceService.sayHello() 메서드 실행");
		String message = "hello~~~"+name;
		return message;
	}

}
