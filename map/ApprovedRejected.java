import java.util.HashMap;
import java.util.Map;

public class ApprovedRejected {
    public static void main(String[] args){
        Map<String,Double> students_list = new HashMap<>();
        students_list.put("Lucas", 6.8);
        students_list.put("Sonia", 8.9);
        students_list.put("Rafael", 7.0);
        students_list.put("João", 5.6);
        students_list.put("Sophia", 7.2);

        for (Map.Entry<String,Double> sde :students_list.entrySet()){
            if (sde.getValue() < 7){
                System.out.println(sde.getKey() + " - Failed");
            }
            else {
                System.out.println(sde.getKey() + " - Approved");
            }
        }
    }
}