package task2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class secondTask {

    public static void main(String[] args) {
        String text = "Old there any widow law rooms. Agreed but expect repair she nay sir silent person. Direction can dependent one bed situation attempted. His she are man their spite avoid. Her pretended fulfilled extremely education yet. Satisfied did one admitting incommode tolerably how are.";

        List<String> words = Arrays.asList(text.split(" "));
        HashSet<String> uniqueWords = new HashSet<>(words);

        System.out.println(uniqueWords);
    }
}
