package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.example.config.ApplicationConfig;
import com.example.controller.ContructorInjection;
import com.example.controller.PropertyInjection;
import com.example.controller.SetterInjection;
import com.example.model.Company;

@SpringBootApplication
@ComponentScan({"com.example.controller","com.example.service"})
public class SpringDiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = 
				SpringApplication.run(SpringDiDemoApplication.class, args);
		
		ContructorInjection cont =
				(ContructorInjection) context.getBean("contructorInjection");
		cont.booking();
		
		SetterInjection set = context.getBean(SetterInjection.class);
		set.booking();
		
		PropertyInjection prop = context.getBean(PropertyInjection.class);
		prop.booking();
		
		AnnotationConfigApplicationContext context2 = 
				new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		Company comp = context2.getBean(Company.class);
		comp.showDepartmentInformation();
		comp.showEmployeeInformation();
		
	}
}
