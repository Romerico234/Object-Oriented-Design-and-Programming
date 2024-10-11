import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class InClassExercise {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("one");
        stringArrayList.add("two");
        stringArrayList.add("three");
        stringArrayList.add("four");
        stringArrayList.add("five");

        System.out.println("ArrayList Regular For Loop:");
        for (int i = 0; i < stringArrayList.size(); i++) {
            System.out.print(stringArrayList.get(i) + " ");
        }
        System.out.println();

        System.out.println("-----------------------");

        System.out.println("ArrayList Iterator:");
        Iterator<String> iterator1 = stringArrayList.iterator();
        while (iterator1.hasNext()) {
            String str = iterator1.next();
            System.out.print(str + " ");
        }
        System.out.println();

        System.out.println("-----------------------");

        System.out.println("TreeSet Iterator:");
        TreeSet<String> stringTreeSet = new TreeSet<>();
        stringTreeSet.add("apple");
        stringTreeSet.add("banana");
        stringTreeSet.add("cherry");
        stringTreeSet.add("date");
        stringTreeSet.add("elderberry");

        Iterator<String> iterator2 = stringTreeSet.iterator();

        while (iterator2.hasNext()) {
            String str = iterator2.next();
            System.out.print(str + " ");
        }

    }
}