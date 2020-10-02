package lesson5;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(factorial(5)); //рекурсия с условием
        recursion(5); //бесконечная рекурсия (ну почти)
    }

    public static int factorial(int n){
        if (n == 1){
            return 1;
        }
        return (n * factorial(n - 1));
    }

    public static void recursion(int n){
        System.out.println(n);
        recursion(n - 1);
    }
}
