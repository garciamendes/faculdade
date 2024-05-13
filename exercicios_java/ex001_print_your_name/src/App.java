public class App {
    public static void main(String entrada[]) {
        int n1;
        double n2, soma;
        char letra;

        n1 = Integer.parseInt(entrada[0]);
        n2 = Double.parseDouble(entrada[1]);
        letra = entrada[2].charAt(0);

        // Processamento
        soma = n1 + n2;

        // Saída dos Resultados
        System.out.println(n1 + " + " + n2 + " = " + soma + " sinal " + letra);

    }
  }