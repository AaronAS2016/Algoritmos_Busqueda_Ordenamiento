package ordenamiento;

import static org.junit.Assert.*;

import org.junit.Test;

public class SeleccionTest {

	@Test
	public void ordenarArray98742146() {
		// int[] array = { 1, 5, 4, 3, 2, 9, 8, 7, 6 };
		int[] array = { 3, 1, 2, 4 };
		int[] arrayOrdenado = { 1, 2, 3, 4 };
		// int[] arrayOrdenado = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		Seleccion seleccion = new Seleccion();
		assertArrayEquals(arrayOrdenado, seleccion.ordenar(array));

	}
}
