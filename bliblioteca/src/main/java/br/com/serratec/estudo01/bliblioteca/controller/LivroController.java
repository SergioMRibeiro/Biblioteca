package br.com.serratec.estudo01.bliblioteca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.serratec.estudo01.bliblioteca.domain.Livro;
import br.com.serratec.estudo01.bliblioteca.exeptions.LivroIdInvalidoException;
import br.com.serratec.estudo01.bliblioteca.service.LivroService;

@RestController
@RequestMapping("/biblioteca")
public class LivroController {
	
	@Autowired
	private LivroService livroService;
	
	@RequestMapping("/teste")
	public String dandoUmOi() {
		return "Olá";
	}
	
	
	@GetMapping
	public List<Livro> mostrarLivro() {
		return livroService.mostrarLivros();
	}
	
	@PutMapping
	public void adicinandoLivro(@RequestBody Livro livro) throws LivroIdInvalidoException  {
		livroService.adicionarLivro(livro);
		
	}
	
	
}
