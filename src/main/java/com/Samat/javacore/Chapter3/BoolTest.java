public class BoolTest {
    public static void main(String[] args) {
        boolean b;
        b = false;
        System.out.println("b ����� " + b);
        b = true;
        System.out.println("b ����� " + b);

        //�������� ���� boolean ����� ��������� ���������� if
        if (b) System.out.println("���� ��� ������������");
        b = false;
        if (!b) System.out.println("���� ��� �� ������������");

        //��������� ��������� - �������� ���� boolean
        System.out.println("10 > 9 ����� " + (10 > 9));

    }
}
