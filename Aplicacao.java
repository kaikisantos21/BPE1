package prj_zoologico;

public class Aplicacao {

	public static void main(String[] args) {
		ClasseAnimal elefante = new ClasseAnimal();
		elefante.atributoNome = "Dumbo";
		elefante.atributoRaca = "Africano";
		elefante.atributoSexo = "macho";
		elefante.atributoPeso = 170;
		
		ClasseAnimal girafa = new ClasseAnimal("GitHub","Russa","Femea",50);
		
		SubiclasseCarnivoros leao = new SubiclasseCarnivoros();
		leao.atributoNome = "Leaodro";
		leao.atributoRaca = "Australeandro";
		leao.atributoSexo = "Neutro";
		leao.atributoPeso = 123;
		
		leao.exibirInfo();
		leao.metodoCacar();
		
		elefante.exibirinfo();
		
		elefante.metodoComer();
		
		elefante.exibirinfo();
		
		girafa.exibirinfo();
		
		
				
		
	}

}
