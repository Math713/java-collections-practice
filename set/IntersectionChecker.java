import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionChecker {
    public static void main(String[] args){

        Set<Integer> a = new HashSet<>(Arrays.asList(55, 59, 20, 57, 1));
        Set<Integer> b = new HashSet<>(Arrays.asList(21, 55, 19, 24, 31));

        Set<Integer> intersection = new HashSet<>(a);
        intersection.retainAll(b);
        System.out.println(intersection);
    }
}
