package main;

import java.util.Scanner;

public class ExercicioIF02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		
		System.out.print("Informe o numero: ");
		number = sc.nextInt();

		if(number > 0 && number % 2 == 0) {
			System.out.println("O numero e par e positivo");
		} else if(number < 0 && number % 2 == 0) {
			System.out.println("O numero e par e negativo");
		} else if(number > 0 && number % 1 == 0) {
			System.out.println("O numero e impar e positivo");
		} else if(number < 0 && number % 1 == 0) {
			System.out.println("O numero e impar e negativo");
		}
		
		
		sc.close();
				
	}

}
