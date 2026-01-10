import java.util.Map;
import java.util.TreeMap;

public class MapWithObject {
    public static void main(String[] args){
        Map<String, Student> studentMap = new TreeMap<>();

        studentMap.put("Jonathas", new Student("Engineering", 8.8));
        studentMap.put("Ana", new Student("Medicine", 8.3));
        studentMap.put("Arthur", new Student("Nutrition", 6.8));
        studentMap.put("Matheus", new Student("Software Engineering", 7.7));

        for (Map.Entry<String,Student> sss: studentMap.entrySet()){
            System.out.println(sss.getKey() + " - " + sss.getValue());
        }

    }
}
