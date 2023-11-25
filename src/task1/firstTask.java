package task1;

import java.util.ArrayList;
import java.util.List;

public class firstTask {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = -1000; i <= 1000; i++) {
            numbers.add(i);
        }

        int left = 0;
        int right = numbers.size() - 1;
        while (left < right) {
            while (numbers.get(left) >= 0) {
                left++;
            }
            while (numbers.get(right) < 0) {
                right--;
            }

            int temp = numbers.get(left);
            numbers.set(left, numbers.get(right));
            numbers.set(right, temp);
        }

        System.out.println(numbers);
    }
}

