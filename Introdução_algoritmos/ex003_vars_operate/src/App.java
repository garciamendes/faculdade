import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Integer n1, n2, n3, media;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        n1 = scanner.nextInt();

        System.out.print("Digite a segunda nota: ");
        n2 = scanner.nextInt();

        System.out.print("Digite a terceira nota: ");
        n3 = scanner.nextInt();

        media = (n1 + n2 + n3) / 3;

        System.out.println("A média é: " + media);
        scanner.close();
    }
}
