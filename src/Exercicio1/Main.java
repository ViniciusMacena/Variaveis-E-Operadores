package Exercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Exercicio 1
		
		float salario, abono, novoSalario;

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o Salário: ");
		salario = sc.nextFloat();

		System.out.println("Digite o Abono: ");
		abono = sc.nextFloat();

		novoSalario = salario + abono;

		System.out.printf("Novo Salário: %.2f", novoSalario);

	}
	

}
