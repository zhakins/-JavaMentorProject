public class A {
    int i, j;

    void shwij() {
        System.out.println("i & j: " + i + " " + j);
    }
}

class B extends A {
    int k;

    void showk() {
        System.out.println("k: " + k);
    }

    void sum() {
        System.out.println("i+j+k: " + (i + j + k));
    }
}

class SimpleInheritance {
    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B();


        //���������� ������ �������������� ��������������
        superOb.i = 10;
        superOb.j = 20;
        System.out.println("���������� ������� superOb: ");
        superOb.shwij();
        System.out.println();

        //�������� ����� ������ �� ���� �������� ������ ������ �����������
        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        System.out.println("���������� ������� subOb: ");
        subOb.shwij();
        subOb.showk();

        System.out.println();
        System.out.println("����� i,j,k � ������� subOb: ");
        subOb.sum();

    }
}