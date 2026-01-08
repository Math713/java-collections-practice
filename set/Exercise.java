import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Set<String> hashSet = new HashSet<>();

        int quantity_unique_person = 0;

        System.out.println("Type 'exit' to leave");
        while (true){
            System.out.print("Name: ");
            String name = scanner.nextLine().trim().toLowerCase();

            if (name.equalsIgnoreCase("exit")){
                System.out.println("Leaving...");
                break;
            }

            if (hashSet.contains(name)){
                System.out.println("Name already added!");
            }
            else {
                hashSet.add(name);
                quantity_unique_person++;
            }
        }
        System.out.println("Quantity's of uniques persons: " + quantity_unique_person);
        System.out.println("List: " + hashSet);
        scanner.close();
    }
}