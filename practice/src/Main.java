import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       int[] a = {1, 2, 3, 4};
       int[] b = {5, 6, 7, 8};

       int[] c = dotProduct(a, b);

       for (int value : c) {
           System.out.print(value + " ");
       }
    }

    public static int[] dotProduct(int[] a, int[] b) {
        int n = a.length;
        int[] c = new int[n];

        for (int i = 0; i < n; i++) {
            c[i] = a[i]*b[i];
        }

        return c;
    }


}