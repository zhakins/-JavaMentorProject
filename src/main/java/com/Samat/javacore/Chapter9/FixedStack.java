public class FixedStack implements IntStack {
    private int stck[];
    private int tos;

    // �������� ������ � ���������������� ����
    FixedStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    @Override
    public void push(int item) {
        if (tos == stck.length - 1) System.out.println("���� ��������");
        else stck[++tos] = item;
    }

    @Override
    public int pop() {
        if (tos < 0) {
            System.out.println("���� �� ��������");
            return 0;
        } else return stck[tos--];
    }
}
