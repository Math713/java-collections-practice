import java.util.Set;
import java.util.TreeSet;

public class LotteryNumbers{
    public static void main(String[] args){

        Set<Integer> integerSet = new TreeSet<>();

        while(integerSet.size() < 6){
            int number = (int) (Math.random() * 60) + 1;
            integerSet.add(number);
        }

        integerSet.forEach(System.out::println);
    }
}
