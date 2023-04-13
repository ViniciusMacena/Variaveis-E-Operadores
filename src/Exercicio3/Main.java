package Exercicio3;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Exercicio 3
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		
		System.out.println("Salario Bruto: ");
		salarioBruto = sc.nextFloat();
		
		System.out.println("Adicional Noturno: ");
		adicionalNoturno = sc.nextFloat();
		
		System.out.println("Horas Extras: ");
		horasExtras = sc.nextFloat();
		
		System.out.println("Descontos: ");
		descontos = sc.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
		
		System.out.printf("Salario Liquido: %.2f",salarioLiquido);
		
		

	}

}
