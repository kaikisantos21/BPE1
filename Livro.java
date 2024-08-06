package prjCaneta;

public final class Livro {
    Scanner sc = new Scanner (System.in);
    
    String nomeLivro;nomeAutor;
    boolean alugado;
    
    public Livro(String nome,String Autor) {
    	this.nomeLivro = Livro;
    	this.nomeAutor = autor;
    }   this.alugado = false;
    
    void status() {
    	System.out.println(this.nomeLivro +":"+ (this.alugado ? "alugado":"Disponivel"));
    }
}
