import java.util.List;

public class Neurona {

    private static double[] entradasX;
    private static double classe;
    
	private int verifica(double resultado) {

		if (resultado < 0) {
			return -1;
		} else {
			return 1;
		}
	}

	private int perceptron(Double[] entradas, Double[] pesos) {

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
	
	private void treinamento(Double[] entradas, Double[] pesos) {
		
		int retornoPerceptron = perceptron(entradas, pesos);
		
	}
	
    private static void separarEntradas(double[] itemX)
    {
    	int bias = 1;
    	
        entradasX = new double[] { itemX[0], itemX[1], bias };
        classe = itemX[2];
    }

}
