import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        System.out.println("How many integers do you want to sort? ");
        int[] array = new int[in.nextInt()];

        for (int i = 0; i < array.length; i++){
            System.out.println("Enter the " + (i + 1) + "th integer: ");
            array[i] = in.nextInt();
        }

        int t = 0;

        System.out.println("original array:");
        for (int i : array){
            System.out.print(i + " ");
        }

        for (int i = 0; i < array.length - 1; i++){
            for (int j = 0; j < array.length - i - 1; j++){
                if (array[j] > array[j + 1]){
                    t = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = t;
                }
            }
        }

        System.out.println("");
        System.out.println("sorted array:");
        for (int i : array){
            System.out.print(i + " ");
        }



        in.close();

    }

}
