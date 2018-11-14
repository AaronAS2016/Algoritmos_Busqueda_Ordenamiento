package ordenamiento;
import static org.junit.Assert.*;

import org.junit.Test;

public class OrdenamientoTest {

	@Test
	public void comprobarSiEstaOrdenadoArraydelal0() {
		Ordenamiento ordenamiento = new Ordenamiento();
		int[] array = { 1, 2, 4, 5, 7, 8, 8, 9 };
		assertTrue(ordenamiento.estaOrdenado(array));
	}

	@Test
	public void comprobarSiEstaDesordenadoArraydelal0() {
		Ordenamiento ordenamiento = new Ordenamiento();
		int[] array = { 1, 2, 10, 5, 7, 8, 8, 9 };
		assertFalse(ordenamiento.estaOrdenado(array));
	}

	@Test
	public void comprobarSiEstaDesordenadoArrayde10a1() {
		Ordenamiento ordenamiento = new Ordenamiento();
		int[] array = { 10, 9, 8, 7, 2, 2, 1 };
		assertTrue(ordenamiento.estaOrdenado(array));
	}

}
