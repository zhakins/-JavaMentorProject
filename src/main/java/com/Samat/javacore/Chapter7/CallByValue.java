public class CallByValue {
    public static void main(String[] args) {
        Test ob = new Test();
        int a = 15, b = 20;

        System.out.println("a & b �� ������: " + a + " " + b);
        ob.meth(a, b);

        System.out.println("a & b ����� ������: " + a + " " + b);

    }
}
