public class Overload {
    public static void main(String[] args) {
        OverloadDemo ob = new OverloadDemo();
        double result;
        int i = 88;
        //������� ��� ������ test()
        ob.test();
        ob.test(10);
        ob.test(10, 20);
        //result = ob.test(123.5);
        //System.out.println("��������� ������         ob.test(123.5): " + result);
        ob.test(i);
        ob.test(123.2);
    }
}
