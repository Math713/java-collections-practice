import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UpdateGrade {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Map<String,Double> grades_names = new HashMap<>();
        grades_names.put("Matheus".toLowerCase(), 8.0);
        grades_names.put("Maria".toLowerCase(), 7.9);
        grades_names.put("Bia".toLowerCase(), 6.5);
        grades_names.put("Pedro".toLowerCase(), 9.2);
        grades_names.put("Serjo".toLowerCase(), 8.5);

        for (Map.Entry<String,Double> ssd: grades_names.entrySet()){
            System.out.println(ssd.getKey() + " - " + ssd.getValue());
        }

        System.out.print("\nType the name of the person that you want to change the grade: ");
        String name = sc.nextLine().trim().toLowerCase();

        if (!grades_names.containsKey(name)){
            System.out.println("Type correctly.");
            return;
        }

        System.out.print("New grade: ");
        double new_grade = sc.nextDouble();
        boolean correctlyGrade = true;

        if (new_grade >= 0 && new_grade <= 10){
            grades_names.put(name,new_grade);
        }
        else {
            System.out.println("Only grades from 0 to 10!");
            correctlyGrade = false;
        }

        if (correctlyGrade) {
            System.out.println("\nUpdated table.......");
            for (Map.Entry<String, Double> ssd : grades_names.entrySet()) {
                System.out.println(ssd.getKey() + " - " + ssd.getValue());

            }
        }
        sc.close();
    }
}