package busqueda;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinariaTest {

	@Test
	public void BuscarNumero8() {
		Binaria busqueda = new Binaria();
		int[] arrayOrdenado = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		assertEquals(8, busqueda.buscar(arrayOrdenado, 8));
	}

	@Test
	public void BuscarConArrayDe0PosicionesYNoEncuentra() {
		Binaria busqueda = new Binaria();
		int[] arrayOrdenado = { 5 };
		assertEquals(-1, busqueda.buscar(arrayOrdenado, 4));
	}

	@Test
	public void BuscarConArrayDe5PosicionesYBuscarElPrimerValor() {
		Binaria Binaria = new Binaria();
		int[] arrayOrdenado = { 8, 25, 36, 40, 90 };
		assertEquals(0, Binaria.buscar(arrayOrdenado, 8));
	}

	@Test
	public void BuscarConArrayDe0yQueEncuentre() {
		Binaria Binaria = new Binaria();
		int[] arrayOrdenado = { 8 };
		assertEquals(0, Binaria.buscar(arrayOrdenado, 8));
	}

	@Test
	public void BuscarConArrayDe4YBuscarElUltimoValor() {
		Binaria Binaria = new Binaria();
		int[] arrayOrdenado = { -20, -10, -5, -1 };
		assertEquals(3, Binaria.buscar(arrayOrdenado, -1));
	}

	@Test
	public void BuscarConArrayDe3YqueBusqueEl8() {
		Binaria Binaria = new Binaria();
		int[] arrayOrdenado = { -20, -10, -5 };
		assertEquals(-1, Binaria.buscar(arrayOrdenado, 8));
	}

}
