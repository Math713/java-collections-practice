import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ProhibitedWordsFilter {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Set<String> filter = new HashSet<>();
        filter.add("idiota");
        filter.add("spam");
        filter.add("fraude");
        filter.add("senha");
        filter.add("hack");

        boolean foundProhibitedWord = false;

        System.out.println("Write a comment: ");
        String comment = sc.nextLine().trim().toLowerCase();
        String[] fields = comment.split(" ");
        System.out.println();

        for (String f: fields){
            if (filter.contains(f)){
                System.out.println("Its not allowed the word '" + f + "'");
            }
        }

        if (!foundProhibitedWord){
            System.out.println("No prohibited words were detected");
        }

        sc.close();
    }
}