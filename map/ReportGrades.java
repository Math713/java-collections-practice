import java.util.HashMap;
import java.util.Map;

public class ReportGrades {
    public static void main(String[] args){
        Map<String, Double> grades_names = new HashMap<>();
        grades_names.put("Matheus", 8.0);
        grades_names.put("Mathias", 6.8);
        grades_names.put("Daniel", 7.9);
        grades_names.put("Mariana", 5.2);
        grades_names.put("Julia", 9.5);

        double sum = 0.0;
        for (Map.Entry<String, Double> ssd: grades_names.entrySet()){
            sum += ssd.getValue();
        }
        double avg = sum / grades_names.size();


        double higher = 0.0;
        for (Map.Entry<String, Double> ssd: grades_names.entrySet()){
            if (ssd.getValue() > higher){
                higher = ssd.getValue();
            }
        }

        double smaller = grades_names.get("Matheus");

        for (Map.Entry<String, Double> ssd: grades_names.entrySet()){
            if (ssd.getValue() < smaller){
                smaller = ssd.getValue();
            }
        }

        System.out.printf("Average: %.2f%n", avg);
        System.out.println("Higher grade: " + higher);
        System.out.println("Smaller grade: " + smaller);
    }
}
