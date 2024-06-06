package main;

import java.util.Scanner;

public class ExercicioIF01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		
		System.out.print("Informe o primeiro numero: ");
		a = sc.nextInt();
		System.out.print("Informe o segundo numero: ");
		b = sc.nextInt();
		System.out.print("Informe o terceiro numero: ");
		c = sc.nextInt();
		
		if((a + b) > c) {
			System.out.println("A soma de A + B e maior do que C");
		} else if((a + b) < c) {
			System.out.println("A soma de A + B e menor do que C");
		} else if( (a + b) == c) {
			System.out.println("A soma de A + B e igual a C");
		}
		
		sc.close();
	}

}
