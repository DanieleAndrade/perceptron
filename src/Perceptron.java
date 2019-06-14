
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Perceptron {

   public static void main(String[] args) {

       //Valores Entradas

	   List<Double[]> entradas = new ArrayList<>();
	   entradas.add(new Double[] { 1.0, 0.1, (double) 1 });
       entradas.add(new Double[] { 9.4, 6.4, (double) -1 });
       entradas.add(new Double[] { 2.5, 2.1, (double) 1 });
       entradas.add(new Double[] { 8.0, 7.7, (double) -1 });
       entradas.add(new Double[] { 0.5, 2.2, (double) 1 });
       entradas.add(new Double[] { 7.9, 8.4, (double) -1 });
       entradas.add(new Double[] { 7.0, 7.0, (double) -1 });
       entradas.add(new Double[] { 2.8, 0.8, (double) 1 });
       entradas.add(new Double[] { 1.2, 3.0, (double) 1 });
       entradas.add(new Double[] { 7.8, 6.1, (double) -1 });
       


       //Valores Pesos (aleatorios)

       double peso1 = new Random().nextDouble();

       double peso2 = new Random().nextDouble();
       
       double peso3 = new Random().nextDouble();

       Double[] pesos = new Double[]{peso1,peso2,peso3};
       
       //Neurona n = new Neurona(entradas, aprendizagem, pesos);

 

  }

}
