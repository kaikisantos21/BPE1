package programaçao_backend

import java.util.Scanner;

public class condicional {
	
	public static void main(String) [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("quantos minutos voce usou?");
		int minutos = sc.nextInt();
		double conta = 50.00;
		if (minutos > 100) {
			(minutos-100) *2;
		}
	}
}