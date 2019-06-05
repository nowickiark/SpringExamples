package com.example.SpringStarter;

import com.example.SpringStarter.controller.KitchenControl;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import sun.awt.AppContext;

@SpringBootApplication
public class SpringStarterApplication {

	public static void main(String[] args) {

		//SpringApplication.run(SpringStarterApplication.class, args);

        ApplicationContext ctx = SpringApplication.run(SpringStarterApplication.class, args);


		System.out.println(ctx.getBean(KitchenControl.class).getDish());


	}

}
