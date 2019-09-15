import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        firstTask();
        secondTask();
        thirdTask();
        fourthTask();
        fifthTask();
    }

    static void firstTask() {
        int[] array = {0, 1, 1, 0, 1, 0, 1, 0, 1, 0};
        System.out.println(Arrays.toString(array));

        for (int count = 0; count < array.length; count++) {
            if (array[count] == 0) {
                array[count] = 1;
            } else {
                array[count] = 0;
            }
        }

        System.out.println(Arrays.toString(array));

    }

    static void secondTask() {
        int[] second = new int[8];
        System.out.println(Arrays.toString(second));

        for (int count = 0; count < second.length; count++) {
            second[count] = count * 3;

        }
        System.out.println(Arrays.toString(second));
    }

    static void thirdTask() {
        int[] third = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int count = 0; count < third.length; count++) {
            if (third[count] < 6) {
                third[count] = third[count] * 2;
            }
        }
        System.out.println(Arrays.toString(third));
    }

    static void fourthTask() {
        int[][] fourth = new int[4][4];
        for (int count = 0; count < fourth.length; count++) {
            for (int count2 = 0; count2 < fourth[count].length; count2++) {
                if (count == count2) {
                    fourth[count][count2] = 1;
                }
            }
            System.out.println(Arrays.toString(fourth[count]));
        }
    }

    static void fifthTask() {
        int fifth[] = {2, 89, 500, 0, 2019, 32, 15, 8, 1, 56};
        int max = fifth[0];
        int min = fifth[0];
        for (int count = 1; count <fifth.length; count++) {
            if (max < fifth[count]) {
                max = fifth[count];
            }
            if (min > fifth[count]) {
                min = fifth[count];
            }
        }
            System.out.println(min + " " + max);


    }
}
