import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;

public class FibonacciTest {

    @Test
    public void testCalculateCallsFibonacci10Times() {
        AlgorithmUtils mockAlgorithm = mock(AlgorithmUtils.class);
        Fibonacci fibonacci = new Fibonacci();
        fibonacci.calculate(10);

        Mockito.verify(mockAlgorithm, times(10));
    }

}
