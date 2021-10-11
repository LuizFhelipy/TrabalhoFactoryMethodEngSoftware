package br.edu.univas.FactoryMethod.Poligonos;

import br.edu.univas.FactoryMethod.Poligono;

public class Triangulo implements Poligono {

	@Override
	public void getDescription() {
		System.out.println("     *\n"
	               + "    ***\n"
	               + "   *****\n"
		       + "  *******\n"
		       + " *********\n"
		       + "************\n"
		       + "\nVoce escolheu o Triangulo");
	}

	
}
