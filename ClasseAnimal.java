package prj_zoologico;

public class ClasseAnimal {
	//Atributos
	String atributoNome;
	String atributoRaca;
	String atributoSexo;
	double atributoPeso;
	
	//construtores 
	
	public ClasseAnimal() {
		
	}
	
	public ClasseAnimal(String parametroNome,String parametroRaca,String parametroSexo,double parametroPeso) {
		this.atributoNome = parametroNome;
		this.atributoRaca = parametroRaca;
		this.atributoSexo = parametroSexo;
	    this.atributoPeso = parametroPeso;
	}
	//metodos
		public void metodoComer() {
			if (this.atributoPeso >= 170) {
				System.out.println(this.atributoNome + "esta obeso, vamos exercitar");
			}
			else {
				this.atributoPeso += 10;
			}
			
			
			 this.atributoPeso += 10;
			
		}
		
		public void matodoExercitar() {
			if (this.atributoPeso <= 50) {
				System.out.println(this.atributoNome + ", que tal se exercitar");
			}
			else {
			this.atributoPeso -=10;
			}
			public void exibirinfo() {
				System.out.println("Nome: + this.atributoNome");
				System.out.println("Peso:"+ this.atributoPeso);
			}
		
		}
		   
			

    





















	    
	    
	
	
	
