package main;

import java.util.Scanner;

public class ExercicioSwitch01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int quantidade, codigoProduto;
		double valorUnitario,valorTotal;
		
		System.out.print(" Codigo do  -    Produto    -    Preco Unitario\r\n");
		System.out.println("  Produto ");
		System.out.println(
				  "    1        Cachorro Quente -   R$ 10.00\r\n"
				+ "    2	     X-Salada        -   R$ 15.00\r\n"
				+ "    3	     X-Bacon         -   R$ 18.00\r\n"
				+ "    4	     Bauru           -   R$ 12.00\r\n"
				+ "    5	     Refrigerante    -   R$  8.00\r\n"
				+ "    6	     Suco de laranja -   R$ 13.00\r\n"
				+ "");
		
		System.out.print("Informe o codigo do produto: ");
		codigoProduto = sc.nextInt();
		System.out.print("Informe a quantidade do produto: ");
		quantidade = sc.nextInt();
		
		switch(codigoProduto){
			case 1:
				
				valorUnitario = 10.00;
				valorTotal = quantidade * valorUnitario;
				System.out.printf("Produto: Cachorro-quente. Valor Total R$ %.2f", valorTotal);
				break;
				
			case 2:
				
				valorUnitario = 15.00;
				valorTotal = quantidade * valorUnitario;
				System.out.printf("Produto: X-Salada. Valor Total R$ %.2f", valorTotal);
						break;
			case 3:
						
						valorUnitario = 18.00;
						valorTotal = quantidade * valorUnitario;
						System.out.printf("Produto: X-Bacon. Valor Total R$ %.2f", valorTotal);
						break;
			case 4:
				
				valorUnitario = 12.00;
				valorTotal = quantidade * valorUnitario;
				System.out.printf("Produto: Bauru. Valor Total R$ %.2f", valorTotal);
				break;
			case 5:
				
				valorUnitario = 8.00;
				valorTotal = quantidade * valorUnitario;
				System.out.printf("Produto: Refrigerante. Valor Total R$ %.2f", valorTotal);
				break;
			
			case 6:
				
				valorUnitario = 13.00;
				valorTotal = quantidade * valorUnitario;
				System.out.printf("Produto: Suco de laranja. Valor Total R$ %.2f", valorTotal);
				break;
				
			default:
				System.out.println("Opção inválida!");
				}
		
		sc.close();
		
}

}
