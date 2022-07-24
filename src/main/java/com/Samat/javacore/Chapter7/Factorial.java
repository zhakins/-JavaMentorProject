public class Factorial {
    //то рекурсивный метод
    int fact(int n) {
        int result;
        if (n == 1) return 1;
        return fact(n - 1) * n;
    }
}
