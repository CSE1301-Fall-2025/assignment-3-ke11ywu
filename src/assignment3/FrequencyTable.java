import java.util.Scanner;

public class FrequencyTable {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("How many dice do you want to roll? ");
        int totalDice = in.nextInt();
        int[] rolls = new int[(6 * totalDice) - totalDice + 1];
        int currentSum = 0;

        for (int i = 0; i < 10000; i++){
            for (int j = 0; j < totalDice; j++){
                currentSum = currentSum + ((int)(Math.random() * 6) + 1);
            }
            rolls[currentSum - totalDice]++;
            currentSum = 0;
        }

        for (int i : rolls){
            System.out.print(i + " ");
        }



    }

}
