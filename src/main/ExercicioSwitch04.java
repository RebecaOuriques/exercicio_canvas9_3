package main;

import java.util.Scanner;

public class ExercicioSwitch04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float saldo = 1000, valor;
		int operacao;
		System.out.print(" Codigo da  |    \r\n");
		System.out.println("  Operacao  | Operacao ");
		System.out.println();
		System.out.println(
				  "    1          Saldo \r\n"
				+ "    2	       Saque\r\n"
				+ "    3	       Deposito\r\n"
				+ "");
		System.out.print("Informe a operacao desejada: ");
		operacao = sc.nextInt();
		
		switch(operacao) {
		case 1 :
			System.out.printf("Operacao - Saldo \nSaldo: R$ %.02f" , saldo);
			break;
		case 2 :
			 valor = sc.nextFloat();
			saldo = saldo - valor;
			if (saldo < 0) {
				System.out.println("Operacao - Saque \nSaldo Insuficiente!");
			} else 
			System.out.printf("Operacao - Saque \nNovo Saldo: R$ %.02f", saldo);
			break;
		case 3 :
			 valor = sc.nextFloat();
			 saldo = saldo + valor;
			System.out.printf("Operacao - Deposito \nNovo Saldo: R$ %.02f", saldo);
			break;
			
			default:
				System.out.println("Operacao Invalida!");
		}
		
		
		System.out.println();
		
		
		sc.close();
	}

}
