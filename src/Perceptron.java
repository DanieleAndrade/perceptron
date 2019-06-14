
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Perceptron {

   public static void main(String[] args) {

       //Valores Entradas

	   List<Double[]> entradas = new ArrayList<>();
	     entradas.add(new Double[] { 1.0, 0.1});
       entradas.add(new Double[] { 9.4, 6.4});
       entradas.add(new Double[] { 2.5, 2.1});
       entradas.add(new Double[] { 8.0, 7.7});
       entradas.add(new Double[] { 0.5, 2.2});
       entradas.add(new Double[] { 7.9, 8.4});
       entradas.add(new Double[] { 7.0, 7.0});
       entradas.add(new Double[] { 2.8, 0.8});
       entradas.add(new Double[] { 1.2, 3.0});
       entradas.add(new Double[] { 7.8, 6.1});

        //Valores Saídas

       List<int> saidas = new ArrayList<>();
  	     saidas.add(1);
         saidas.add(-1);
         saidas.add(1);
         saidas.add(-1);
         saidas.add(1);
         saidas.add(-1);
         saidas.add(-1);
         saidas.add(1);
         saidas.add(1);
         saidas.add(-1);

       //Valores Pesos (aleatorios)

       double peso1 = new Random().nextDouble();

       double peso2 = new Random().nextDouble();

       double peso3 = new Random().nextDouble();

       Double[] pesos = new Double[]{peso1,peso2,peso3};

       Neuronio n = new Neuronio();
       n.treinamento(Double[] entradas, Double[] pesos, List<int> saidas);




  }

}
