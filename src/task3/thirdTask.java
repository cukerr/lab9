package task3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class thirdTask {

    public static void main(String[] args) {
        String text = "Not him old music think his found enjoy merry. Listening acuteness dependent at or an. Apartments thoroughly unsatiable terminated sex how themselves. She are ten hours wrong walls stand early. Domestic perceive on an ladyship extended received do. Why jennings our whatever his learning gay perceive. Is against no he without subject. Bed connection unreserved preference partiality not unaffected. Years merit trees so think in hoped we as.";

        List<String> words = Arrays.asList(text.split(" "));
        HashMap<String, Integer> wordFrequencies = new HashMap<>();

        for (String word : words) {
            if (wordFrequencies.containsKey(word)) {
                wordFrequencies.put(word, wordFrequencies.get(word) + 1);
            } else {
                wordFrequencies.put(word, 1);
            }
        }

        System.out.println(wordFrequencies);
    }
}
