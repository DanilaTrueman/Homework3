import java.lang.reflect.Array;

public class MultiplicationTable {
    public static void main(String[] args) {
        int n = 10;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.println(i * j + "\t");
            }
            System.out.println();
        }
    }
}