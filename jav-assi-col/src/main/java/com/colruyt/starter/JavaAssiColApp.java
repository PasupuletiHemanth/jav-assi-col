package com.colruyt.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

//@ComponentScan(value="com.colruyt.starter")
//@ComponentScan(value={"com.colruyt.starter","com.colruyt.util"})
@ComponentScan({"com.colruyt.starter","com.colruyt.util"})
@SpringBootApplication
public class JavaAssiColApp {

	public static void main(String[] args) {

   // SpringApplication.run(JavaAssiColApp.class, args);
		
		ApplicationContext applicationContext = SpringApplication.run(JavaAssiColApp.class, args);
		
		/*for(String str:applicationContext.getBeanDefinitionNames())
		{
			System.out.println(str);
		}*/
	}

}
