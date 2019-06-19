import java.util.List;

public class Neuronio {

	private static Double[] entradasX;
	private static int saida;

	private int ativacao(double resultado) {
		if (resultado < 0) {
			return -1;
		}

		return 1;
	}

	private int perceptron(Double[] entradas, double[] pesos) {

		double resultado = 0.0;
    	int index = 0;

		for (Double peso : pesos) {
			for (int i = index; i < entradas.length; i++) {
				resultado += peso * entradas[i];
        		index += 1;
				break;
			}
		}

		return ativacao(resultado);
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

		boolean erro = false;

		for (Double[] entrada : entradas) {

			int indexEntra = entradas.indexOf(entrada);
			double vies = 1;
			entradasX = new Double[] { entrada[0], entrada[1], vies };
			saida = saidas.get(indexEntra);

			int saidaEsperada = saida;

			while (true) {

				int saidaPerceptron = perceptron(entradasX, pesos);

				if (saidaEsperada == saidaPerceptron) {
					System.out.println("Não houve erro para essa entrada " + entrada[0] + "," + entrada[1] + ", " + saida);
					break;
				} else {
					erro = true;
					System.out.println("Houve erro para essa entrada " + entrada[0] + "," + entrada[1] + ", " + saida);
					pesos = atualizarPesos(entradasX, pesos, saidaEsperada, saidaPerceptron);
				}

			}

		}

		if (erro) {
			treinamento(entradas, pesos, saidas);
			System.out.println("Pesos finais: (" + pesos[0] + "," + pesos[1] + ", " + pesos[2] + ")");
		}

	}

}