package hm28;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetToTreeSet {
    public static <T> Set<T> getInstance(Set<T> hashSet){
        Set<T> treeSet = new TreeSet<>(hashSet);
        return treeSet;
    }

    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Car");
        hashSet.add("Plane");
        hashSet.add("Ship");
        hashSet.add("Bicycle");

        Set<String> treeSet = getInstance(hashSet);
        System.out.println(treeSet);
    }
}
