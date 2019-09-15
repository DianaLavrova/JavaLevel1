public class MainClass {
    public static void main(String[] args) {
        System.out.println("Hello world!!");
        int i = 5;
        boolean a = true;
        double b = 2.35;
        byte d = -3;
        short e = 500;
        long f = 7654890765L;
        float p = 65.89f;
        char t = 'a';
        System.out.println("test calculate: " + calculateTest(4, 5, 6, 8));
        System.out.println(checkRange(5, 7));
        printPositiveOrNegative(-6);
        System.out.println(isPositive(8));
        sayHello("Diana");
        System.out.println(isLeapYear(104));
    }

    public static int calculateTest(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    public static boolean checkRange(int j, int y) {
        return (j + y >= 10) && (j + y <= 20);
    }

    public static void printPositiveOrNegative(int p) {
        if (p < 0) {
            System.out.println("Number " + p + " is negative");
        } else {
            System.out.println("Number " + p + " is positive");

        }
    }

    public static boolean isPositive(int p) {
        return p >= 0;
    }

    public static void sayHello(String name){
        System.out.println("Привет, " +  name + "!");
    }

    public static boolean isLeapYear(int year) {
        return ((year % 400) == 0) || (((year % 4) == 0)) && ((year % 100) != 0);
    }
}
