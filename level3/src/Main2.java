public class Main2 {
    public static void main(String[] args) {
        for (int k = 1; k <= 10; k++) {
            System.out.println();
            for (int j = k; j <= 10; j++) {
                System.out.printf("%4d", k * j);
            }
        }
    }
}