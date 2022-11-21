import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4));
        Iterator<Integer> integerIterator = intList.iterator();
        while (integerIterator.hasNext()) {
            if (integerIterator.next() <= 0) {
                integerIterator.remove();
            }
        }
        Iterator<Integer> integerIterator2 = intList.iterator();
        while (integerIterator2.hasNext()) {
            if (integerIterator2.next() % 2 != 0) {
                integerIterator2.remove();
            }
        }
        Collections.sort(intList);
        System.out.println(intList);
    }
}
