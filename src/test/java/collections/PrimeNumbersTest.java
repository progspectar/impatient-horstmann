package collections;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class PrimeNumbersTest {

    @Test
    void whenOk() {
        int n = 30;
        Set<Integer> expected = Set.of(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        Set<Integer> result = PrimeNumbers.getPrimes(n);
        assertThat(result).isEqualTo(expected);
    }
}