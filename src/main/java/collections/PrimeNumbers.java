package collections;

import java.util.HashSet;
import java.util.Set;

public class PrimeNumbers {
    public static Set<Integer> getPrimes(int n) {
        Set<Integer> res = new HashSet<>(n - 1);
        for (int i = 2; i <= n; i++) {
            res.add(i);
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            int j = i * i;
            for (int k = 0; j <= n; k++) {
                j = i * i + k * i;
                res.remove(j);
            }
        }
        return res;
    }
}