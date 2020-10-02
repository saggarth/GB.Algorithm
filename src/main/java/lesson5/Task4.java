package lesson5;

public class Task4 {
    public static void main(String[] args) {
        //на примере всё того же факториала
        int n = 10;
        long startTime = System.nanoTime();

        System.out.println("Факториал " + n + " рекурсией. Равен " + factRec(n) + ". Время: " + (System.nanoTime() - startTime));
        startTime = System.nanoTime();
        System.out.println("Факториал " + n + " циклом. Равен " + factCyc(n) + ".  Время: " + (System.nanoTime() - startTime));

    }
    public static int factRec(int n) {
        if (n == 1){
            return 1;
        }
        return (n * factRec(n-1));
    }

    public static int factCyc(int n){
        int result = 1;
        for (int t = 1; t <= n; t++) {
            result *= t;
        }
        return result;
    }
}