public class A1 {
    int i;
    private int j;

    void setij(int x, int y) {
        i = x;
        j = y;
    }


}

//���� j ������ �1 � ���� ������ �� ��������
class B1 extends A1 {
    int total;


    void sum() {
        //  total = i + j; //������: ���� j � ���� ������ �� ��������
    }

}

class Access {
    public static void main(String[] args) {

        B1 subOb = new B1();
        subOb.setij(10, 20);
        subOb.sum();//
        System.out.println("����� ����� " + subOb.total);
    }
}