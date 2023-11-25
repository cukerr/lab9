package task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class fourthTask {
    public static void main(String[] args) {
        // текст
        String text = "Smile spoke total few great had never their too. Amongst moments do in arrived at my replied. Fat weddings servants but man believed prospect. Companions understood is as especially pianoforte connection introduced. Nay newspaper can sportsman are admitting gentleman belonging his. Is oppose no he summer lovers twenty in. Not his difficulty boisterous surrounded bed. Seems folly if in given scale. Sex contented dependent conveying advantage can use.";

        // Разделение текста на предложения и запись их в список
        List<String> sentences = new ArrayList<>();
        String[] splitSentences = text.split("(?<=[.!?])\\s*");
        Collections.addAll(sentences, splitSentences);

        // Сортировка предложений
        Collections.sort(sentences);

        // Вывод отсортированных предложений
        for (String sentence : sentences) {
            System.out.println(sentence);
        }
    }
}

