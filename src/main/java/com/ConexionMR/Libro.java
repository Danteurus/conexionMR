package com.conexionMR;

public class Libro {
    private int id;
    private String titulo;
    private String autor;
    private String descripcion;
    public Libro(int id, String titulo, String autor, String descripcion) {
    	this.id=id;
    	this.titulo=titulo;
    	this.autor=autor;
    	this.descripcion=descripcion;
    }
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
    
	
}
