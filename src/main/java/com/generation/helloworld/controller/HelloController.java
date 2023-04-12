package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping // anotação p/ responder a requisição get
	public String hello() { //metodo hello
		return "<b>Hello Turma 62!</b>"; // retornando uma string
	}
	
	@GetMapping ("/nome")
	public String meuNome() { 
		return "<b>Yngrid Padilha</b>"; 
	}  
	@GetMapping ("/bsm")
	public String ListaBsms() {
		return "<b>Lista de BSMs</br>Responsabilidade Pessoal<br/>Mentalidade de Crescimentos<b></br>Orientação ao Futuro</br>Persistencia</br>Comunicação</br>Orientação aos Detalhes</br>Trabalho em Equipe</br>Proatividade</br>";
	}
	@GetMapping ("/objetivo")
	public String MeuObjetivo() { 
		return "<b>Melhorar a Comunicação</b>";
}
}
