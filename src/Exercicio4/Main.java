package Exercicio4;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Exercicio 4
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		float numero1,numero2,numero3,numero4,diferenca;
		
		System.out.println("Numero1 ");
		numero1 = sc.nextFloat();
		
		System.out.println("Numero2: ");
		numero2 = sc.nextFloat();
		
		System.out.println("Numero3: ");
		numero3 = sc.nextFloat();
		
		System.out.println("Numero4: ");
		numero4 = sc.nextFloat();
		
		diferenca = (numero1 * numero2) - (numero3 * numero4);
		
		System.out.printf("Diferença: %.2f",diferenca);

	}

}
