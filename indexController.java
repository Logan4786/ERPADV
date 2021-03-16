package com.example.gerenciador;

		
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.gerenciadorusuariosModels.Usuarios;

// Mapeia a unidade pricipal retornando a página solicitada
@Controller
	@RestController
	@RequestMapping("/index.html")
	public class indexController {

	private Usuarios usuarios = new Usuarios();

	@GetMapping("/index.html")


	public void indexController() {

		return ;

	}

}


