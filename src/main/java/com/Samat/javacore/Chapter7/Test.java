public class Test {
    int a, b;
    int a1;//������ ������������ �� ���������
    public int b1;//�������� ������
    private int c1; //�������� ������

    //������ ������� � ����� � ������� ������
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

    //�������� �� ��������
    void meth(int i, int j) {
        i *= 2;
        j /= 2;
    }

    //�������� ������
    void meth(Test o) {
        o.a *= 2;
        o.b /= 2;
    }
}
