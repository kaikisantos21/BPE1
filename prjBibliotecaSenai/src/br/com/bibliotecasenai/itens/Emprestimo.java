package br.com.bibliotecasenai.itens;

import br.com.bibliotecasenai.usarios.Usuarios;

public class Emprestimo {
	//Atributos
	int numeroEmprestimo;
	
	//metodos 
	public void emprestimoLivro(Livro Livro, Usuario usuario) {
		usuario.setLivrosEmprestados(usuario.getLivrosEmprestados()+1);
	}
      public void devolverLivro(Livro livro,Usuario usuario) {
    	  usario.setLivrosEmprestados(usuarios.getLivrosEmprestados()-1);
      }
}
