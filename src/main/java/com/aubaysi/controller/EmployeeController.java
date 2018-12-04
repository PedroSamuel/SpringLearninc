package com.aubaysi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {

	
	@RequestMapping("/") //Mapeamento para endpoint! -> define o url deste método
	//@ResponseBody //Liga método ao body da resposta HTTP! / Não deve ser posto porque devolve o objecto do return, devolve string index em vez de mapear para resources/templates/index
	String index() {
		return "index";
 	}
	
}
