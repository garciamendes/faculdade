import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String name = "";

        System.out.print("Digite seu nome: ");
        name = scanner.nextLine();

        scanner.close();
        System.out.println("Olá, " + name);
    }
}
