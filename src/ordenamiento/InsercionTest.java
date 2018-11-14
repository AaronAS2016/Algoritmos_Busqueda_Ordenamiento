package ordenamiento;

import static org.junit.Assert.*;

import org.junit.Test;

public class InsercionTest {

	@Test
	public void test() {
		int[] array = { 1 ,3 ,2 };
		int[] arrayOrdenado = {1,2,3 };
		Insercion insercion = new Insercion();
		assertArrayEquals(arrayOrdenado, insercion.ordenar(array));
	}

}
