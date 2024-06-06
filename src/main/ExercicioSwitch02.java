package main;

import java.util.Scanner;

public class ExercicioSwitch02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nomeColaborador,cargo;
		int codigoCargo, salario,novoSalario;
		double reajuste;
		
		System.out.print(" Codigo do  -    Cargo    -    Percentual \r\n");
		System.out.println("  Cargo                        do Reajuste  ");
		System.out.println(
				  "    1        Gerente         -    10%\r\n"
				+ "    2	     Vendedor        -    7%\r\n"
				+ "    3	     Supervisor      -    9%\r\n"
				+ "    4	     Motorista       -    6&\r\n"
				+ "    5	     Estoquista	     -    5%\r\n"
				+ "    6	     Tecnico de TI   -    8%\r\n"
				+ "");
		
		System.out.print("Informe o nome do(a) colaborador(a): ");
		nomeColaborador = sc.next();
		System.out.printf("Informe o cargo do(a) colaborador(a) %s : ", nomeColaborador);
		codigoCargo = sc.nextInt();
		System.out.printf("Informe o salario do(a) colaborador(a) %s: ", nomeColaborador);
		salario = sc.nextInt();
		System.out.println();

		switch(codigoCargo){
		case 1:
			
			cargo = "Gerente";
			reajuste = 0.10;
			novoSalario = (int) (salario + (reajuste * salario));
			System.out.printf("Nome do(a) colaborador(a): %s.\nCargo: %s. \nSalario: R$ %d ",nomeColaborador, cargo, novoSalario);

			break;
			
		case 2:
			
			cargo = "Vendedor";
			reajuste = 0.07;
			novoSalario = (int) (salario + (reajuste * salario));
			System.out.printf("Nome do(a) colaborador(a): %s.\nCargo: %s. \nSalario: R$ %d ",nomeColaborador, cargo, novoSalario);
			break;
			
		case 3:
			
			cargo = "Supervisor";
			reajuste = 0.09;
			novoSalario = (int) (salario + (reajuste * salario));
			System.out.printf("Nome do(a) colaborador(a): %s.\nCargo: %s. \nSalario: R$ %d ",nomeColaborador, cargo, novoSalario);
			break;
					
		case 4:
			
			cargo = "Motorista";
			reajuste = 0.06;
			novoSalario = (int) (salario + (reajuste * salario));
			System.out.printf("Nome do(a) colaborador(a): %s.\nCargo: %s. \nSalario: R$ %d ",nomeColaborador, cargo, novoSalario);
			break;
			
		case 5:
			
			cargo = "Estoquista";
			reajuste = 0.05;
			novoSalario = (int) (salario + (reajuste * salario));
			System.out.printf("Nome do(a) colaborador(a): %s.\nCargo: %s. \nSalario: R$ %d ",nomeColaborador, cargo, novoSalario);
			break;
			
		
		case 6:
			
			cargo = "Tecnico de TI";
			reajuste = 0.08;
			novoSalario = (int) (salario + (reajuste * salario));
			System.out.printf("Nome do(a) colaborador(a): %s.\nCargo: %s. \nSalario: R$ %d ",nomeColaborador, cargo, novoSalario);
			break;
			
		default:
			System.out.println("Opção inválida!");
			}
		
		
		sc.close();
	}

}
