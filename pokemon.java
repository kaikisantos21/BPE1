package prjPokemon;

public class pokemon {
  //Atributos
	 String atributoNome;
	 String atributoTipos;
	 int atributoNivel;
	 int atributoHp;
	 
	 //Construtores 
	 
	 public pokemon() {
		 
	 }

    public pokemon(String parametroNome,String parametroTipos,int parametroNivel,int parametroHp) { 
    	this.atributoNome = parametroNome;
    	this.atributoTipos = parametroTipos;
    	this.atributoNivel = parametroNivel;
    	this.atributoHp = parametroHp;
    }
    
    //Metodos 