public class BrealErr {

    public static void main(String[] args) {
        one:
        for (int i = 0; i < 3; i++) {
            System.out.println("������ " + i + ":");
        }
        for (int j = 0; j < 100; j++) {
            //if (j == 10) break one; //������
            if (j == 10) break;
            System.out.print(j + " ");
        }
    }
}
