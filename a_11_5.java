import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class a_11_5 {

    /*
    5. Write a method called sortAndRemoveDuplicates that accepts a list of integers as its parameter and rearranges
    the list’s elements into sorted ascending order, as well as removing all duplicate values from the list. For example,
    the list [7, 4, –9, 4, 15, 8, 27, 7, 11, –5, 32, –9, –9] would become [–9, –5, 4, 7, 8, 11, 15, 27, 32]
    after a call to your method. Use a Set as part of your solution.
     */

    public static void main(String[] args) {

        LinkedList<Integer> testList = new LinkedList<>();

        testList.add(0, 7);
        testList.add(1, 4);
        testList.add(2, -9);
        testList.add(3, 4);
        testList.add(4, 15);
        testList.add(5, 8);
        testList.add(6, 27);
        testList.add(7, 7);
        testList.add(8, 11);
        testList.add(9, -5);
        testList.add(10, 32);
        testList.add(11, -9);
        testList.add(12, -9);

        System.out.println("testList: \n" + testList);
        System.out.println("Expected result for sortAndRemoveDuplicates(testList) \n" +
                "[–9, –5, 4, 7, 8, 11, 15, 27, 32]");
        sortAndRemoveDuplicates(testList);
        System.out.println("Result from sortAndRemoveDuplicates(testList)\n" + sortAndRemoveDuplicates(testList));
    }

    public static Set<Integer> sortAndRemoveDuplicates(LinkedList<Integer> list) {

        Set<Integer> testSet = new TreeSet<>();

        testSet.addAll(list);
        return testSet;
    }
}
