package br.edu.univas.FactoryMethod;

import br.edu.univas.FactoryMethod.Poligonos.Hexagono;
import br.edu.univas.FactoryMethod.Poligonos.Pentagono;
import br.edu.univas.FactoryMethod.Poligonos.Quadrado;
import br.edu.univas.FactoryMethod.Poligonos.Triangulo;

public class PoligonoFactory {

	public static Poligono createPolygon(int numberOfSides) {
		
		if(numberOfSides == 3) {
			return new Triangulo();
		} else if(numberOfSides == 4) {
			return new Quadrado();
		} else if(numberOfSides == 5) {
			return new Pentagono();
		} else if(numberOfSides == 6) {
				return new Hexagono();
		}else {
			return null;
		}
		
	}
}
