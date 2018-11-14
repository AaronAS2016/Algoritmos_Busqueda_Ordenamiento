package ordenamiento;

public class Ordenamiento {

	public boolean estaOrdenado(int[] array) {

		int elementosOrdenadosDeMayorAMenor = 0;
		int elementosOrdenadosDeMenorAMayor = 0;

		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] >= array[i + 1]) {
				elementosOrdenadosDeMayorAMenor++;
			}
			if (array[i] <= array[i + 1]) {
				elementosOrdenadosDeMenorAMayor++;
			}
		}

		return (elementosOrdenadosDeMayorAMenor == array.length - 1)
				|| (elementosOrdenadosDeMenorAMayor == array.length - 1);
	}
}
