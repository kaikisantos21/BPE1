package prj_pokemonV2;

public class Pokemon {
	// Atributos
	String atributoNome;
	String atributoTipo;
	int atributoNivel;
	double atributoVida;
	// Construtores

	public Pokemon() {

	}

	public Pokemon(String ParametroNome, String ParametroTipo, int ParametroNivel, double ParametroVida) {
		this.atributoNome = ParametroNome;
		this.atributoTipo = ParametroTipo;
		this.atributoNivel = ParametroNivel;
		this.atributoVida = ParametroVida;
	}

	public String getAtributoNome() {
		return atributoNome;
	}

	public void setAtributoNome(String atributoNome) {
		this.atributoNome = atributoNome;
	}

	public String getAtributoTipo() {
		return atributoTipo;
	}

	public void setAtributoTipo(String atributoTipo) {
		this.atributoTipo = atributoTipo;
	}

	public int getAtributoNivel() {
		return atributoNivel;
	}

	public void setAtributoNivel(int atributoNivel) {
		this.atributoNivel = atributoNivel;
	}

	public double getAtributoVida() {
		return atributoVida;
	}

	public void setAtributoVida(double atributoVida) {
		this.atributoVida = atributoVida;

	}

	// Metodos

	public void metodoAtacar() {
		System.out.println(Nome + ": Está atacando");

	}

	public void metodoEvoluir() {
		System.out.println(Nome + ": Está evoluindo");
	}

}
