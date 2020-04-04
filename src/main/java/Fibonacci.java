import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    private AlgorithmUtils algorithmUtils = new AlgorithmUtils();

    public void calculate(int input) {
        int counter = 0;
        List<Long> sequence = new ArrayList<>();

        while (counter++ <= input) {

            Long i = algorithmUtils.fibonacci(sequence);
            sequence.add(i);

        }

        System.out.println(sequence);
    }


    public void calculateRecursive() {
        Long input = 5L;
        Long output = recurse(input);
        System.out.println(output);
    }

    public Long recurse(Long input) {
        if (input < 2) {
//            System.out.println(1L);
            return 1L;
        } else {
            Long recuse1 = recurse(input - 1);
            Long recurse2 = recurse(input - 2);
//            System.out.println(recuse1);
//            System.out.println(recurse2);
            Long calculatedValue = recuse1 + recurse2;
//            System.out.println(calculatedValue);
            return calculatedValue;
        }
    }

}
