package main;

import java.util.Scanner;

public class ExercicioSwitch03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float num1, num2,resultado;
		int operacao;
		System.out.print(" Codigo  -    Operacao \r\n");
		System.out.println(
				  "    1          Soma \r\n"
				+ "    2	       Subtracao\r\n"
				+ "    3	       Multiplicacao\r\n"
				+ "    4	       Divisao\r\n"
				+ "");
		
		System.out.print("Digite o primeiro numero: ");
		num1 = sc.nextFloat();
		System.out.print("Digite o segundo numero: ");
		num2 = sc.nextFloat();
		System.out.print("Escolha o numero da operacao: ");
		operacao = sc.nextInt();
		
		
		switch(operacao) {
		case 1 :
			resultado = num1 + num2;
			System.out.println(num1 + " + " + num2 + " = " + resultado);
			break;
			
		case 2 :
			resultado = num1 - num2;
			System.out.println(num1 + " - " + num2 + " = " + resultado);
			
			break;
		case 3 :
			resultado = num1 * num2;
			System.out.println(num1 + " * " + num2 + " = " + resultado);
			
			break;
		case 4 :
			resultado = num1 / num2;
			System.out.println(num1 + " / " + num2 + " = " + resultado);
			break;
		default:
			System.out.println("Operacao invalida!");
			
		}
		
		
		sc.close();
	}

}
