import java.util.List;

public class Neuronio {

	private static Double[] entradasX;
	private static int saida;

	private int verifica(double resultado) {

		if (resultado < 0) {
			return -1;
		} else {
			return 1;
		}
	}

	private int perceptron(Double[] entradas, double[] pesos) {

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

	public static double[] atualizarPesos(Double[] entradasX2, double[] pesos, int saidaEsperada, int saidaPerceptron) {
		int j = 0;
		double aprendizado = 0.2;

		for (int i = 0; i < pesos.length; i++) {
			for (j = j; j < entradasX.length; j++) {
				pesos[i] = pesos[i] + aprendizado * (saidaEsperada - saidaPerceptron) * entradasX[j];
				j = j + 1;
				break;
			}
		}

		return pesos;
	}

	public void treinamento(List<Double[]> entradas, double[] pesos, List<Integer> saidas) {

		boolean erro = true;
		int saidaEsperada = saida;

		for (Double[] entrada : entradas) {

			separarEntradas(entrada, saidas);

			while (erro) {

				int saidaPerceptron = perceptron(entradasX, pesos);

				if (saidaEsperada == saidaPerceptron) {
					erro = false;
					System.out.println(
							"Não houve erro para essa interação" + entrada[0] + "," + entrada[1] + ", " + saida);
					break;
				} else {
					System.out.println("Houve erro para essa interação" + entrada[0] + "," + entrada[1] + ", " + saida);
					double[] novosPesos = atualizarPesos(entradasX, pesos, saidaEsperada, saidaPerceptron);
				}

			}

		}

	}

	private static void separarEntradas(Double[] itemEntrada, List<Integer> saidas) {

		entradasX = new Double[] { itemEntrada[0], itemEntrada[1] };

		for (int i = 0; i <= saidas.size(); i++) {
			saida = i;

		}

	}

}
