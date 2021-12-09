package com.ConexionMR;

import java.util.*;

public class Libros {
    private ArrayList<Libro> libros;

    public Libros()
    {
        this.libros = new ArrayList();
    }

    public boolean agregarLibro(Libro libro){
        return libros.add(libro);
    }

    public void removerLibro(int id)
    {
        for(Libro i : libros){
            if(i.getId() == id){
                libros.remove(i);
            }
        }
    }

    public void editarTitulo(int id, String Titulo){
        int j = 0;
        for(Libro i : libros){
            if(i.getId() == id){
                libros.get(j).setTitulo(Titulo);
            }
            j++;
        }
    }

    public void editarAutor(int id, String autor){
        int j = 0;
        for(Libro i : libros){
            if(i.getId() == id){
                libros.get(j).setAutor(autor);
            }
            j++;
        }
    }

    public void editarDescripcion(int id, String descripcion){
        int j = 0;
        for(Libro i : libros){
            if(i.getId() == id){
                libros.get(j).setDescripcion(descripcion);
            }
            j++;
        }
    }
}
