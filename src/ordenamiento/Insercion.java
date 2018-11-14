package ordenamiento;

public class Insercion {
	public int[] ordenar(int[] array) {

		int aux;
		int actual;
		for (int i = 0; i < array.length; i++) {
			aux = array[i];
			for (actual = i; actual > 0 && array[i - 1] > aux; actual--) {
				array[actual] = array[actual - 1];
			}
			array[actual] = aux;
		}
		return array;
	}
}
