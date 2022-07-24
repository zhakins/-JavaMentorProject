public class Overload {
    public static void main(String[] args) {
        OverloadDemo ob = new OverloadDemo();
        double result;
        int i = 88;
        //вызвать все методы test()
        ob.test();
        ob.test(10);
        ob.test(10, 20);
        //result = ob.test(123.5);
        //System.out.println("Результат вызова         ob.test(123.5): " + result);
        ob.test(i);
        ob.test(123.2);
    }
}
