import java.util.Arrays;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin", "potato"};

        int wordNumber = (int) (Math.random() * (words.length - 1));
        String word = words[wordNumber];

        while (true) {

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Угадайте слово: ");

        String userAnswer = scanner1.next();

        if (userAnswer.equals(word)) {
            System.out.println("Вы угадали слово ");
            break;
        } else {
            System.out.println("Вы не угадали");
        }

        char[] hint = new char[(word.length() + (int) (Math.random() * 10))];
        Arrays.fill(hint, '#');

        int minLength = Math.min(word.length(), userAnswer.length());
        for (int i = 0; i < minLength; i++) {
            if (word.charAt(i) == userAnswer.charAt(i)) {
                hint[i] = word.charAt(i);
            }
        }
        System.out.println("Подсказка:" + String.copyValueOf(hint));
    }

    }
}
