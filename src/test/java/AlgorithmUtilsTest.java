import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class AlgorithmUtilsTest {

    private AlgorithmUtils algorithmUtils;

    @Before
    public void setUp() {
        algorithmUtils = new AlgorithmUtils();
    }

    @Test
    public void testSequenceIsEmptyFibonacciReturns1() {
        List<Integer> sequence = new ArrayList<>();

        int firstNumber = algorithmUtils.fibonacci(sequence);

        assertEquals(1, firstNumber);
    }

    @Test
    public void testSequenceHas3ElementsReturnsSumOfLast2() {
        List<Integer> sequence = new ArrayList<>();
        sequence.add(1);
        sequence.add(1);
        sequence.add(2);
        int number = algorithmUtils.fibonacci(sequence);

        assertEquals(3, number);
    }
}
