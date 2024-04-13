import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Integer[] numbers = new Integer[5];
        Scanner scanner = new Scanner(System.in);
        String[] utilsText = {"Primeiro", "Segundo", "Terceiro", "Quarto", "Quinto"};

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + utilsText[i] + " número: ");
            numbers[i] = scanner.nextInt();
        }

        Integer sum = 0;
        for (int i : numbers) {
            sum += i;
        }

        System.out.println("A soma dos números informado é: " + sum);
        scanner.close();
    }
}
