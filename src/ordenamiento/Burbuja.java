package ordenamiento;

public class Burbuja {

	public int[] ordenar(int[] array) {

		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j + 1]) {
					int auxiliar = array[j];
					array[j] = array[j + 1];
					array[j + i] = auxiliar;
				}
			}
		}

		return array;
	}
}
