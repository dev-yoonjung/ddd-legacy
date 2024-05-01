package calculator.number;

import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class Positives {

    private final List<Positive> positives;

    public static final Positives EMPTY = new Positives(Collections.emptyList());

    public Positives(String[] texts) {
        this.positives = Arrays.stream(texts)
                .map(Positive::new)
                .toList();
    }

    public Positives(List<Positive> positives) {
        this.positives = positives;
    }

    public int sum() {
        return this.positives.stream()
                .mapToInt(Positive::getIntValue)
                .sum();
    }

    private List<Positive> convert(String[] texts) {
        return Arrays.stream(texts)
                .map(Positive::new)
                .toList();
    }

}