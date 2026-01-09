import java.util.HashMap;
import java.util.Map;

public class RegisterGrades {
    public static void main(String[] args){

        Map<String, Double> grades_names = new HashMap<>();

        grades_names.put("Pedro", 8.0);
        grades_names.put("Lucas", 7.8);
        grades_names.put("Maria", 6.8);

        for (Map.Entry<String,Double> stringDoubleEntry: grades_names.entrySet()){
            System.out.println(stringDoubleEntry);
        }

        // Testando get
        System.out.println(grades_names.get("Pedro"));
    }
}
