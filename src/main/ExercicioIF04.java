package main;

import java.util.Scanner;

public class ExercicioIF04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String tipo1, tipo2, tipo3;
		
		System.out.print("Informe o primeiro tipo: Vertebrado ou Invertebrado: ");
		tipo1 = sc.next();
		
		if (tipo1.equalsIgnoreCase("VERTEBRADO")) {
			System.out.print("Informe o segundo tipo: Ave ou Mamifero: ");
			tipo2 = sc.next();
			
			if (tipo2.equalsIgnoreCase("AVE")) {
				System.out.print("Informe o segundo tipo: Carnivoro ou Onivoro: ");
				tipo3 = sc.next();					
				
				if (tipo3.equalsIgnoreCase("CARNIVORO"))  {
					System.out.print("Aguia");						
				} else if (tipo3.equalsIgnoreCase("ONIVORO"))  {
					System.out.print("Pomba");						
				}
			} 	else if (tipo2.equalsIgnoreCase("MAMIFERO")) {
				System.out.print("Informe o segundo tipo: Onivoro ou Herbivoro: ");
				tipo3 = sc.next();
				if (tipo3.equalsIgnoreCase("ONIVORO")) {
					System.out.println("Homem");						
				} else if (tipo3.equalsIgnoreCase("HERBIVORO")){
					System.out.println("Vaca");						
				}		
			}
			
		} else if (tipo1.equalsIgnoreCase("INVERTEBRADO")) {
			System.out.print("Informe o segundo tipo: Inseto ou Anelideo: ");
			tipo2 = sc.next(); 
			
			if (tipo2.equalsIgnoreCase("INSETO")) {
				System.out.print("Informe o segundo tipo: Hematofago ou Herbivoro: ");
				tipo3 = sc.next();	
				
				if (tipo3.equalsIgnoreCase("HEMATOFAGO")) {
					System.out.print("Pulga");						
				} else if (tipo3.equalsIgnoreCase("HERBIVORO")) {
					System.out.print("Lagarta");						
				}
			} 	else if (tipo2.equalsIgnoreCase("ANELIDEO")) {
				System.out.print("Informe o segundo tipo: Hematofago ou Onivoro: ");
				tipo3 = sc.next();
				if (tipo3.equalsIgnoreCase("HEMATOFAGO")) {
					System.out.print("Sanguesuga");						
				} else if (tipo3.equalsIgnoreCase("ONIVORO")) {
					System.out.print("Minhoca");						
				}
				
			}
			
		}

		sc.close();
}
}


