package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AnalizeSets {

    public static Set union(Set previous, Set current) {
        boolean res = previous.addAll(current);
        return previous;
    }

    public static Set intersection(Set previous, Set current) {
        boolean res = previous.retainAll(current);
        return previous;
    }

    public static Set difference(Set previous, Set current) {
        boolean res = previous.removeAll(current);
        return previous;
    }

    public static void main(String[] args) {
        Map<Integer, String> hm = new HashMap<>();
        hm.put(10, "1");
        hm.put(20, "2");
        hm.put(30, "3");
        for (var el : hm.entrySet()) {
            hm.merge(el.getKey(), el.getValue(), (p, c) -> p + c);
            System.out.println(el);
        }
        System.out.println(hm);

    }
}
