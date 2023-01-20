package exercises;

import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length:");
        int length = input.nextInt();
        System.out.println("Enter the width:");
        int width = input.nextInt();
        input.close();
        System.out.println("The area = " + (length * width));
    }
}
