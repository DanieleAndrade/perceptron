import java.util.List;

public class Neuronio {

    private static double[] entradasX;
    private static int saida;

	private int verifica(double resultado) {

		if (resultado < 0) {
			return -1;
		} else {
			return 1;
		}
	}

	private int perceptron(Double[] entradas, Double[] pesos, List<int> saidas) {

		double resultado = 0.0;

		for (Double peso : pesos) {
			for (int i = 0; i < entradas.length; i++) {
				resultado += peso * entradas[i];
				i += 1;
				break;
			}
		}

		return verifica(resultado);
	}

	private void treinamento(Double[] entradas, Double[] pesos, List<int> saidas) {

		int retornoPerceptron = perceptron(entradas, pesos);

	}

    private static void separarEntradas(double[] itemEntrada, List<int> saidas)
    {
    	int bias = 1;
      entradasX = new double[] { itemEntrada[0], itemEntrada[1], bias };
      saida = saidas[0];

    }

}
