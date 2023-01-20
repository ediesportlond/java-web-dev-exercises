package exercises;
import java.util.Scanner;

public class MPG {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        int miles = input.nextInt();
        System.out.println("How much gas have you consumed?");
        int gas = input.nextInt();
        input.close();
        System.out.println("Your vehicles MPG = " + (miles/gas));
    }
}
