package br.edu.univas.main;

import java.util.Scanner;

import br.edu.univas.FactoryMethod.Poligono;
import br.edu.univas.FactoryMethod.PoligonoFactory;

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
							Poligono Triangulo = PoligonoFactory.createPolygon(3);
							Triangulo.getDescription();
							break;
					
						case 2:
							Poligono Quadrado = PoligonoFactory.createPolygon(4);
							Quadrado.getDescription();
							
							break;
						
						case 3:
							Poligono Pentagono = PoligonoFactory.createPolygon(5);
							Pentagono.getDescription();
							break;
						
						case 4:
							Poligono Hexagono = PoligonoFactory.createPolygon(6);
							Hexagono.getDescription();
							break;
					
				    }
			
			 } while(opcao != 0);
			System.out.println("\n********PROGRAMA ENCERRADO!********");
			scanner.close();
	}
}
