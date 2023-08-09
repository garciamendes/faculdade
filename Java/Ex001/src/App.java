
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        List<Float> list_numbers = new ArrayList<Float>();
        float sum = 0;

        for (int i = 1; i <= 50; i++) {
            float num = Float.parseFloat(JOptionPane.showInputDialog("Digite um valor: "));
            list_numbers.add(num);
            sum = sum + num;
        }

        float media = sum / list_numbers.size();
        System.out.print("A média das 50 notas digitadas é: " + media);
    }
}
