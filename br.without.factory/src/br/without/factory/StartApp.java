package br.without.factory;

import java.util.Scanner;

public class StartApp {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int opcao;
		
		do {
			System.out.println("\n********Poligonos*********");
			System.out.println("\nEscolha um Poligono: ");
			System.out.println("1 - Triangulo");
			System.out.println("2 - Quadrado");
			System.out.println("3 - Pentagono");
			System.out.println("4 - Hexagono");
			System.out.println("0 - Para sair");
			
			opcao = scanner.nextInt();
			
			
			
			
				
				
				while(opcao < 0 || opcao > 4) {
					System.out.println("Digite uma opcao valida");
					opcao = scanner.nextInt();
				}
				
				switch(opcao) {
				
					case 1:
						System.out.println("     *\n"
					               		 + "    ***\n"
					               		 + "   *****\n"
					               		 + "  *******\n"
					               		 + " *********\n"
					               		 + "************\n"
					               		 + "\nVoce escolheu o Triangulo");
						break;
				
					case 2:
						System.out.println("***********\n"
							       		 + "***********\n"
							       		 + "***********\n"
							       		 + "***********\n"
							       		 + "***********\n"
							       		 + "***********\n"
							       + "\nVoce escolheu o Quadrado");
						
						break;
					
					case 3:
						System.out.println("       ***\n"
						   	       		 + "     ******* \n"
						   	       		 + "   ***********\n"
						   	       		 + " ***************\n"
						   	       		 + "  *************\n"
						   	       		 + "   *********** \n"
						   	       		 + "    *********\n"
						   	       		 + "\nVoce escolheu o Pentagono");
						break;
					
					case 4:
						System.out.println("   ********\n"
							       		 + " ************ \n"
							       		 + "**************\n"				                       
							       		 + "**************\n"
							       		 + " ************ \n"
							       		 + "   ********\n"
							       		 + "\nVoce escolheu o Hexagono");
						break;
				
			    }
		
		 } while(opcao != 0);
		System.out.println("\n********PROGRAMA ENCERRADO!********");
		scanner.close();
	}
}
