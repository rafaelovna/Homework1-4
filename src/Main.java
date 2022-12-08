public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static void task1() {
        System.out.println("Задача 1");
        for (int i=1; i<=10; i++)
            System.out.println("Итерация цикла " + i);
    }
    public static void task2() {
            System.out.println("Задача 2");

        for (int b=10; b>=1; b--)
            System.out.println("Итерация цикла " + b);
    }
    public static void task3() {
            System.out.println("Задача 3");

        for (int n=0; n<=17; n=n+2)
            System.out.println("Итерация цикла " + n);
    }
    public static void task4() {
            System.out.println("Задача 4");

        for (int r=10; r>=-10; r--)
            System.out.println("Итерация цикла " + r);
    }
}