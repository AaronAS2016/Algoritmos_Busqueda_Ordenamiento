package busqueda;

public class Binaria {
	public int buscar(int[] valores, int valorBuscado) {

		int posicionBuscada = -1;
		int posicionPrimera = 0;
		int posicionUltima = valores.length - 1;

		while (posicionPrimera <= posicionUltima && posicionBuscada < 0) {

			int centro = ((posicionPrimera + posicionUltima) / 2);

			if (valores[centro] > valorBuscado) {

				posicionUltima = centro - 1;

			} else if (valores[centro] < valorBuscado) {

				posicionPrimera = centro + 1;

			} else {

				posicionBuscada = centro;
			}

		}

		return posicionBuscada;

	}

}
