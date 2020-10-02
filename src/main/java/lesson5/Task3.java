package lesson5;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Стек вызова без рекурсии: ");
        funcA();

        System.out.println();

        System.out.println("Стек вызова при рекурсии: ");
        factorial(10);
    }
    public static void funcA(){
        System.out.println("Функиция А вызывает В");
        funcB();
    }
    public static void funcB(){
        System.out.println("Функиция B вызывает С");
        funcC();
    }
    public static void funcC(){
        System.out.println("Функиция C");
    }
    public static int factorial(int n){
        System.out.println("factorial " + n);
        if (n == 1){
            return 1;
        }
        return (n * factorial(n - 1));
    }
}