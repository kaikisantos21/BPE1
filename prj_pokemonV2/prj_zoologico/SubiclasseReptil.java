package prj_zoologico;

public class SubiclasseReptil extends ClasseAnimal{
	//Metodos da SubClasse
	public void metodoTrocarPele() {
		System.out.println(atributoNome + ": Está trocando de pele");
	}
		public void metodoRastejar() {
		  System.out.println(atributoNome + ": Está rastejando");	
		}
    @Override
    public void metodoEmitirSom() {
    	System.out.println(atributoNome + "KASHIKASHI");
    }

}
