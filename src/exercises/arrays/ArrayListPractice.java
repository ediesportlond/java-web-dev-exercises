package exercises.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {
  private static void fiveChars(ArrayList<String> words, int target){
    for (String word : words ){
      if(word.length() >= target) System.out.println(word);
    }
  }

  public static void main(String[] args) {
    // ArrayList<Integer> nums = new ArrayList<>();

    // nums.add(0);
    // nums.add(2);
    // nums.add(3);
    // nums.add(5);
    // nums.add(7);
    // nums.add(8);
    // nums.add(10);
    // nums.add(11);
    // nums.add(13);
    // nums.add(1);
    
    // int sum = 0;

    // for (int num : nums ){
    //   if(num % 2 == 0) sum += num;
    // }

    // System.out.println(sum);

    // ArrayList<String> words = new ArrayList<>();

    // words.add("some");
    // words.add("words");
    // words.add("of");
    // words.add("different");
    // words.add("lengths");

    String myString = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
    String[] myStringArray = myString.split(" ");

    ArrayList<String> words = new ArrayList<>(Arrays.asList( myStringArray ));

    Scanner input = new Scanner(System.in);
    System.out.print("Enter desired string length: ");
    int target = input.nextInt();
    input.close();
    
    fiveChars(words, target);

  }
}
