public class Test {
    int a, b;
    int a1;//доступ определяемый по умолчанию
    public int b1;//открытый доступ
    private int c1; //закрытый доступ

    //методы доступа к члену с данного класса
    void setc1(int i) {
        c1 = i;
    }

    int getc1() {
        return c1;
    }

    Test() {

    }

    Test(int i) {
        a = i;
    }

    Test incrByTen() {
        Test temp = new Test(a + 10);
        return temp;
    }

    Test(int i, int j) {
        a = i;
        b = j;
    }

    boolean equals(Test o) {
        if (o.a == a && o.b == b) return true;
        else return false;
    }

    //передать по значению
    void meth(int i, int j) {
        i *= 2;
        j /= 2;
    }

    //передать объект
    void meth(Test o) {
        o.a *= 2;
        o.b /= 2;
    }
}
