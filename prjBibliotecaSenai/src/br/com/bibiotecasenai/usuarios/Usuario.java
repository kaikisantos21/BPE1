package br.com.bibiotecasenai.usuarios;

public class Usuario extends Pessoa {
	//Atributo
	private int cpf;
	private String livroEmprestados;
	public int getCpf() {
		return cpf;
	}
      public void setCpf(int cpf) {
    	  this.cpf = cpf;
    	  
    }      
      public String getLivrosEmprestados() {
    	  return livrosEmprestados;
    	  
    }
      public void setLivrosEmprestados(String livrosEmprestados) {
    	  this.livrosEmprestados = livrosEmprestados;
      }
	public String getLivroEmprestados() {
		return livroEmprestados;
	}
	public void setLivroEmprestados(String livroEmprestados) {
		this.livroEmprestados = livroEmprestados;
	}
}
