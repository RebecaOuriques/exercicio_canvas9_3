package main;

import java.util.Scanner;

public class ExercicioIF03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nomeDoador;
		int idadeDoador;
		boolean primeiraDoacao = true;

		System.out.print("Digite o nome do doador: ");
		nomeDoador = sc.next();
		System.out.print("Digite a idade do doador: ");
		idadeDoador = sc.nextInt();
		System.out.print("Primeira doacao: ");
		primeiraDoacao = sc.nextBoolean();

		if (idadeDoador >= 18 && idadeDoador < 60) {
			System.out.printf("%s esta apto para doar sangue!",nomeDoador);
		} else if (idadeDoador < 18){
			System.out.printf("%s nao esta apto para doar sangue!",nomeDoador);
		} else if (idadeDoador > 59 && idadeDoador <= 69 ) {
			if (primeiraDoacao != true) {
				System.out.printf("%s esta apto para doar sangue!",nomeDoador);
			} else {
				System.out.printf("%s nao esta apto para doar sangue!",nomeDoador);
			}
		} 
		






		sc.close();
	}

}
