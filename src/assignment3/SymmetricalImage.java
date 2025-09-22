import java.util.Scanner;

public class SymmetricalImage {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("enter a value n for an n x m array: ");
        int n = in.nextInt();
        System.out.println("enter a value m for an n x m array: ");
        int m = in.nextInt();
        int[][] array = new int[n][m];

        int nstar = 0;
        int mstar = 0;

        for (int i = 0; i < (n * m / 4); i++){
            nstar = (int)(Math.random() * n);
            mstar = (int)(Math.random() * m);
            array[nstar][mstar] = 1;
            array[nstar][array[0].length - 1 - mstar] = 1;
        }

        System.out.println("A randomly generated, symmetrical " + n + " x " + m + " image:");
        for (int[] i : array){
            for (int j : i){
                if (j == 0){
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }

    }

}
