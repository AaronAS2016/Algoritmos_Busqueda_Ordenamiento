package ordenamiento;

public class Seleccion {

	public int[] ordenar(int[] vector) {

		int auxiliar;
		for (int i = 0; i < vector.length - 1; i++) {
			int max = i;
			for (int j = i + 1; j < vector.length; j++) {
				if (vector[j] < vector[max]) {
					max = j;
				}
			}

			auxiliar = vector[max];
			vector[max] = vector[i];
			vector[i] = auxiliar;
		}
		return vector;
	}
}
