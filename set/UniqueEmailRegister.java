import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueEmailRegister {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Set<String> list_emails = new HashSet<>();
        int quantity_emails = 0;

        System.out.println("Type 'exit' to leave");
        while (true){
            System.out.print("Email: ");
            String email = sc.nextLine().trim();

            if (email.equalsIgnoreCase("exit")){
                System.out.println("Leaving....");
                break;
            }

            if (!list_emails.contains(email)){
                quantity_emails++;
                list_emails.add(email);
            }
        }

        System.out.println("======= Emails =======");
        for (String s: list_emails){
            System.out.println(s);
        }
        System.out.println("Quantity of unique emails: " + quantity_emails);

        sc.close();
    }
}
