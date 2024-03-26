public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("задача 1");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("задача 2");

        for (int e = 10; e >= 1; e--) {
            System.out.println(e);
        }
        System.out.println("задача 3");

        for (int r = 0; r < 17; r = r + 2) {
            System.out.println(r);
        }
        System.out.println("задача 4");

        for (int f = 10; f >= -10; f--) {
            System.out.println(f);
        }
        System.out.println("задача 5");

        for (int d = 1904; d <= 2096; d = d + 4) {
            System.out.println(d + " год является високосным");
        }
        System.out.println("задача 6");

        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
        System.out.println("задача 7");

        for (int o = 1; o <= 512; o = o * 2) {
            System.out.println(o);
        }
        System.out.println("задача 8");


        System.out.println("задача 9");

        int deposit = 15000;
        int total = 0;
        int i = 0;
        while (total <= 2459000) {
            total = total + total/100;
            total = total + deposit;
            i = i + 1;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }

        System.out.println("задача 10");

        for (int e = 1; e <= 10; e++) {
            System.out.println(" 2 * " + e + " = " + (e * 2));
        }
    }
}