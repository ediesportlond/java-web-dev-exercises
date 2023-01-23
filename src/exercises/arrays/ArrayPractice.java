package exercises.arrays;

import java.util.Arrays;

public class ArrayPractice {
  public static void main(String[] args) {
    // int[] nums = {1, 1, 2, 3, 5, 8};

    // for(int num : nums){
    //   System.out.println(num);
    // }

    // Odd numbers only
    // for (int num: nums){
    //   if(num % 2 != 0) System.out.println(num);
    // }

    String myString = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";

    String[] myStringArray = myString.split("\\.");

    System.out.println(Arrays.toString(myStringArray));
  }
}
