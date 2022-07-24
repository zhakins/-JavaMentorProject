public class AccessTest {
    public static void main(String[] args) {
        Test ob = new Test();

        ob.a1 = 10;
        ob.b1 = 20;
        // ob.c==100; будет не доступен

        //Доступ к члену с данного класса должен осуществляться с помощью методов е класса
        ob.setc1(100);
        System.out.println("a,b,c: " + ob.a1 + " " + ob.b1 + " " + ob.getc1());
    }
}
