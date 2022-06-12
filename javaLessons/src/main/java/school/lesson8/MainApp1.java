package school.lesson8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class MainApp1 {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Barsik");
        names.add("Basya");
        names.add("Funtic");
        names.add("Bonya");
        names.add("Garry");
        names.add("Mia");
        names.add("Belyash");
        names.add("Barsik");
        names.add("Basya");
        names.add("Funtic");
        names.add("Funtic");
        names.add("Funtic");
        names.add("Garry");
        names.add("Garry");
        names.add("Basya");
        names.add("Basya");
        names.add("Basya");

        Iterator<String> iter = names.iterator();

        System.out.println("Get all names:" + names);

        HashSet<String> uniqNames = new HashSet<>();

        while (iter.hasNext()) {
            uniqNames.add(iter.next());
        }

        Iterator<String> uniqIter = uniqNames.iterator();

        System.out.println("Get uniq names:" + uniqNames);

        HashMap<String, Integer> namesCount = new HashMap<>();

        int count = 0;
        while (uniqIter.hasNext()) {
            Iterator<String> newIter = names.iterator();
            String uniqName = uniqIter.next();
            while (newIter.hasNext()) {
                String name = newIter.next();
                if (name.equals(uniqName)) {
                    namesCount.put(uniqName, ++count);
                }
            }
            count = 0;
        }

        System.out.println("Get uniq names with count: ");
        for (HashMap.Entry<String, Integer> e : namesCount.entrySet()) {
            System.out.println(e.getKey() + ": " + e.getValue());
        }
    }
}
