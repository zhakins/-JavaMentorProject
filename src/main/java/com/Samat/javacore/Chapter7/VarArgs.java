public class VarArgs {
    static void vaTest(int... v) {
        System.out.print("Количество аргументов: " + v.length + " Содержимое: ");
        for (int x : v
        ) {
            System.out.print(x + " ");
            System.out.println();

        }
    }

    public static void main(String[] args) {
        int n1[] = {10};
        int n2[] = {1, 2, 3};
        int n3[] = {};
        vaTest(10);
        vaTest(1, 2, 3, 4);
        vaTest();
    }
}
