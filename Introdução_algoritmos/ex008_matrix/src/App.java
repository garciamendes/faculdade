public class App {
    public static void main(String[] args) throws Exception {
        int[][] matrix = new int[10][5];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("----------- V --------------");

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = matrix[i][j] += 2;
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
