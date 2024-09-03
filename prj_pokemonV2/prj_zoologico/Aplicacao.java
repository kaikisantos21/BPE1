package prj_zoologico;

public class Aplicacao {

	public static void main(String[] args) {
		ClasseAnimal elefante = new ClasseAnimal();
		elefante.setNome("Dumbo");
		elefante.setPeso(-100);


		
		//Objeto
		ClasseAnimal girafa = new ClasseAnimal("Xuxulia","Russa","Femea",300);
		
		SubiClasseCarnivoros leao = new SubiClasseCarnivoros();
		leao.atributoNome = "leaodro";
		leao.atributoRaca = "Australeandro";
		leao.atributoSexo = "femea";
		leao.atributoPeso = 111; 
		
		leao.exibirInfo();
		leao.metodosCacar();
		
		elefante.exibirInfo();
		elefante.exibirInfo();
		
		
		
		
		
		elefante.exibirInfo();
		
		elefante.metodoComer();
		
		elefante.exibirInfo();
		
		girafa.exibirInfo();
	}

}