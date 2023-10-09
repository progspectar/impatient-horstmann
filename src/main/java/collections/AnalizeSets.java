package collections;

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
}
