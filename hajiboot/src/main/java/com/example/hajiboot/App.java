package com.example.hajiboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * Hello world!
 *
 */
@RestController
@EnableAutoConfiguration
public class App 
{
	@RequestMapping("/test")	// 이 메서드가 http요청을 받아들이는 메서드
	String home(){
		System.out.println("@@@@ 여긴 ㅁ ㅏ스 ㅌ ㅓ 브런치 @@@@@");
		return "hellooooo worldd22334455";
	}
	
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SpringApplication.run(App.class, args);
    }
}
