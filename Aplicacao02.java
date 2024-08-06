package prjCaneta;

public class Aplicacao02 {

	public static void main(String[] args) {
		Livro livro = new livro("Alice no Pais,Julio Trigueiro");
		Livro livro = new livro("quarto de despeijo","Pedro Francisco");
		
		System.out.println("Livro disponiveis");
		System.out.print("01.");
		livro01.status();
		System.out.print("02.");
		livro02.status();
		
		System.out.println("Qual livro deseja alugar");
		int escolha = sc.nextint();
	}

}
