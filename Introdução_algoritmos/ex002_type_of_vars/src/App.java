public class App {
    public static void main(String[] args) throws Exception {
        /**
         * Classifique os dados de acordo com seu tipo independente do algoritmo,
         * caso seja um string(literal) conte seu tamanho e caso seja double(real) diga quantas casas
         * decimais possui, para Int(inteiros) e reais verifique se é negativo ou positivo:
         *  - "Eu gosto de programar"
         *  - 123976.0
         *  - 1.3849
         *  - ""
         *  - "nome"
         *  - 0
         *  - "@##$%"
         */

        String n_1 = "Eu gosto de programar";
        double n_2 = 123976.0;
        double n_3 = 1.3849;
        String n_4 = "";
        String n_5 = "nome";
        int n_6 = 0;
        String n_7 = "@##$%";


        String str_n_2 = Double.toString(n_2);
        String[] x = str_n_2.split("[.]");

        String str_n_3 = Double.toString(n_3);
        String[] n3_splited = str_n_3.split("[.]");

        System.out.println(n_1.length());
        System.out.println(x[x.length - 1].length());
        System.out.println(n3_splited[n3_splited.length - 1].length());
        System.out.println(n_4.length());
        System.out.println(n_5.length());
        System.out.println(n_6 + " é" + (n_6 >= 0 ? " Positivo" : " Negativo"));
        System.out.println(n_7.length());
    }
}
