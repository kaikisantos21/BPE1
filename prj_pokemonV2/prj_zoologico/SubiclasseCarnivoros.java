package prjZoologico;

public class SubiClasseCarnivoros extends ClasseAnimal{
	//Metodos da SubClasse
	public void metodosCacar() {
		System.out.println(this.atributoNome +"está caçando");
		
	
	}	
		@Override
		public void metodoEmitirSom() {
			System.out.println("RUUAARR");
		
	}

}