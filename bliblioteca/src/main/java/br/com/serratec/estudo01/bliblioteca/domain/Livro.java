package br.com.serratec.estudo01.bliblioteca.domain;

public class Livro {
	private Integer id;
	private String titulo, autor;
	private Boolean lido;
	
	
	public Livro(Integer id, String titulo, String autor, Boolean lido) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.lido = lido;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public Boolean getLido() {
		return lido;
	}
	public void setLido(Boolean lido) {
		this.lido = lido;
	}
	
	

}
