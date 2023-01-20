package exercises;
import java.util.Scanner;

public class AliceSearch {
    public static void main(String[] args) {
        String alice = "Alice was beginning to get very " +
                "tired of sitting by her sister on the " +
                "bank, and of having nothing to do: once " +
                "or twice she had peeped into the book her " +
                "sister was reading, but it had no " +
                "pictures or conversations in it, 'and " +
                "what is the use of a book,' thought Alice " +
                "'without pictures or conversation?'";

        String aliceLower = alice.toLowerCase();

        Scanner input = new Scanner(System.in);

        System.out.println("Enter search term:");
        String query = input.nextLine();
        input.close();

        query = query.toLowerCase();
        int index = aliceLower.indexOf(query);

        if(index >= 0){
            System.out.println("Index: " + index);

            int len = query.length();

            System.out.println("Length: " + len);
            System.out.println(
                    alice.substring(0, index) + alice.substring(index+len)
            );

        } else {
            System.out.println("false");
        }


    }
}
