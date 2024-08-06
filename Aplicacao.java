package prjCaneta;

import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in)
		
		Caneta caneta01 = new Caneta();
		caneta01.modelo = "BIC";
		caneta01.cor = "Azul";
		caneta01.ponta = 0.5;
		caneta01.tampada = false;
		
		Caneta caneta02 = new Caneta();
		canete02.modelo = "feber";
		caneta02.cor = "verde";
		caneta02.ponta = 1.0;
		caneta02.tampada  = true
				
		System.out.println("qual a carga da caneta 01?");
		caneta01.carga = sc.nextInt();
		
		System.out.println("Qual a carga da caneta 02");
		caneta02.carga = sc.nextlnt();
		
		caneta.status();
		caneta.status();
				
				
		
	}

}
