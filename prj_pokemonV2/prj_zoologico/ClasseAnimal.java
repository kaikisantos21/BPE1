package prj_zoologico;

public class ClasseAnimal {
	//Atributos
	 private String atributoNome;
	 private String atributoRaca;
	 private String atributoSexo;
	 private double atributoPeso;
	 private int novo;
	
	//construtores 
	
	public ClasseAnimal() {
		
	}
	
	public ClasseAnimal(String parametroNome,String parametroRaca,String parametroSexo,double parametroPeso) {
		this.atributoNome = parametroNome;
		this.atributoRaca = parametroRaca;
		this.atributoSexo = parametroSexo;
	    this.atributoPeso = parametroPeso;
	}
	
	// Metodos Setters 
	public void setNome (String parametroNome) {
		this.atributoNome = paeametroNome;
	}
	
	public void setPeso(double parametroPeso) {
	if (parametroPeso > 0) {
		this.atributoPeso = parametroPeso;
	}
	else { 
	     this.atributosPeso = 10;
	}
	
	//metodos
		public void metodoComer() {
			if (this.atributoPeso >= 170) {
				System.out.println(this.atributoNome + "esta obeso, vamos exercitar");
			}
			else {
				this.atributoPeso += 10;
				
			}
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

			public String getAtributoNome() {
				return atributoNome;
			}

			public void setAtributoNome(String atributoNome) {
				this.atributoNome = atributoNome;
			}

			public String getAtributoRaca() {
				return atributoRaca;
			}

			public void setAtributoRaca(String atributoRaca) {
				this.atributoRaca = atributoRaca;
			}

			public String getAtributoSexo() {
				return atributoSexo;
			}

			public void setAtributoSexo(String atributoSexo) {
				this.atributoSexo = atributoSexo;
			}

			public double getAtributoPeso() {
				return atributoPeso;
			}

			public void setAtributoPeso(double atributoPeso) {
				this.atributoPeso = atributoPeso;
			}

			public int getNovo() {
				return novo;
			}

			public void setNovo(int novo) {
				this.novo = novo;
			}
		
		}
		   
			

    





















	    
	    
	
	
	
