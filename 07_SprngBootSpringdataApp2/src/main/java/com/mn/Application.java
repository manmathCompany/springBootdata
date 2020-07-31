package com.mn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.mn.entity.Faculty;
import com.mn.entity.Faculty2;
import com.mn.repository.MyRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		MyRepository mr=null;
		
		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
	mr=ctx.getBean(MyRepository.class);
	
		/*
		 * Faculty f=new Faculty(); f.setFId(15); f.setFName("monalisa"); f.setAge(30);
		 * f.setGender("f"); f.setFee(14000.0);
		 * 
		 * 
		 * mr.save(f);
		 */
	
	Faculty2 f=new Faculty2(); f.setFId(101); f.setFName("monalisa"); f.setAge(30);
	  f.setGender("f"); f.setFee(14000.0);
	mr.save(f);
	}

}
