package collections;

import java.util.HashSet;
import java.util.Set;

public class PrimeNumbers {
    public static Set<Integer> getPrimes(int n) {
        Set<Integer> res = new HashSet<>();
        for (int i = 2; i <= n; i++) {
            res.add(i);
        }
        int n1 = (int) Math.sqrt(n);
        for (int i = 2; i <= n1; i++) {
            int i2 = i * i;
            for (int k = 0; k < n; k++) {
                int j = i2 + k * i;
                if (j > n) {
                    break;
                }
                res.remove(j);
            }


        }
        return res;
    }
}
