package br.com.serratec.estudo01.bliblioteca.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.serratec.estudo01.bliblioteca.domain.Livro;
import br.com.serratec.estudo01.bliblioteca.exeptions.LivroIdInvalidoException;

@Service
public class LivroService {
	private List<Livro> cache;
	
	public LivroService() { 
		cache = new ArrayList<Livro>();
		cache.add(new Livro(1, "Jogos Vorazes", "Suzanne Collins", false));
		cache.add(new Livro(2, "Narnia", "Clive Staples Lewis", false));
		cache.add(new Livro(3, "Assassin's Creed: Revelações", "Anton Gill", true));
	}
	
	public List<Livro> mostrarLivros(){
		return cache;
	}
	
	public void adicionarLivro(Livro novoLivro) throws LivroIdInvalidoException {
		if(novoLivro.getId() < 0 ) validacao(novoLivro.getId());
		cache.add(novoLivro);
	}

	private void validacao(Integer id) throws LivroIdInvalidoException {
		if(id < 0 ) throw new LivroIdInvalidoException(id);
		
	}
	
}
