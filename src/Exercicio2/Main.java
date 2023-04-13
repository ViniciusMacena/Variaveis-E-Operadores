package Exercicio2;

import java.util.Locale;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		//Exercicio 2 
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double nota1,nota2,nota3,nota4,mediaFinal;
		
		System.out.println("Digite Nota1: ");
		nota1 = sc.nextDouble();
		
		System.out.println("Digite Nota2: ");
		nota2 = sc.nextDouble();
		
		System.out.println("Digite Nota3: ");
		nota3 = sc.nextDouble();
		
		System.out.println("Digite Nota4: ");
		nota4 = sc.nextDouble();
		
		mediaFinal = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.printf("Média Final: %.1f",mediaFinal);
		
		
		
		

	}

}
