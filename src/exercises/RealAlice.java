
package exercises;
import java.util.Scanner;


public class RealAlice {
    public static void main(String[] args) {
        String aliceString = "Alice was beginning to get very tired of " +
                "sitting by her sister on the bank, and of having nothing " +
                "to do: once or twice she had peeped into the book her sister " +
                "was reading, but it had no pictures or conversations in it, " +
                "'and what is the use of a book,' thought Alice 'without pictures " +
                "or conversation?'";
        System.out.println(aliceString);

        Scanner input = new Scanner(System.in);

        System.out.println("Please search a term to match our sentence!");
        String searchTerm = input.nextLine();
        searchTerm = searchTerm.toLowerCase();
        aliceString = aliceString.toLowerCase();

        System.out.println(aliceString.contains(searchTerm));

        if(aliceString.contains(searchTerm) == true) {
            System.out.println(aliceString.indexOf(searchTerm));

            String removed = aliceString.replaceAll(searchTerm ,"");
            System.out.println(removed);
        }
    }

}
