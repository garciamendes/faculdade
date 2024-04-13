import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Integer[] numbers = new Integer[5];
        Scanner scanner = new Scanner(System.in);
        String[] utilsText = {"Primeiro", "Segundo", "Terceiro", "Quarto", "Quinto"};
        Integer sum = 0;

        int control = 0;
        while (control < 5) {
            System.out.print("Digite o " + utilsText[control] + " número: ");
            numbers[control] = scanner.nextInt();
            sum += numbers[control];
            control++;
        }

        System.out.println("A soma dos números informado é: " + sum);
        scanner.close();
    }
}
