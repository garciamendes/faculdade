import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String[] names = new String[5];
        int[] notes = new int[5];
        Scanner scanner = new Scanner(System.in);

        int current = 1;
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o nome do aluno " + current + " de 5: ");
            names[i] = scanner.nextLine();
            current++;
        }

        int currentNote = 1;
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite a nota " + currentNote + " de 5: ");
            notes[i] = scanner.nextInt();
            currentNote++;
        }

        int media = 0;
        for (int i : notes) {
            media += i;
        }

        System.out.println("A média da turma: " + (media/5));
        scanner.close();
    }
}
