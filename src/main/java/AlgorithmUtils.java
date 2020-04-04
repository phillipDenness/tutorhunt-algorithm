import java.util.List;

public class AlgorithmUtils {

    public Long fibonacci(List<Long> sequence) {

        if (sequence.size() < 2) {
            return 1L;
        }

        return sequence.get(sequence.size() - 1) + sequence.get(sequence.size() - 2);
    }
}
