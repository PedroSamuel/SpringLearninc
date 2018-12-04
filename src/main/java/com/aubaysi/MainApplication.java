package com.aubaysi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

@SpringBootApplication //Configurações por defeito!
@Controller
public class MainApplication {


	
	public static void main(String[] args) {
		//System.out.println("TESTE");
		
		SpringApplication.run(MainApplication.class, args);
	}
}

