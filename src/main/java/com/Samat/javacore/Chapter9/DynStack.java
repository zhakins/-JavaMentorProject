public class DynStack implements IntStack {
    private int stck[];
    private int tos;

    // выделить пам€ть и инициализировать стек
    DynStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    @Override
    public void push(int item) {
        if (tos == stck.length - 1) {
            int temp[] = new int[stck.length * 2];//удваиваем стек
            for (int i = 0; i < stck.length; i++) {
                temp[i] = stck[i];
            }
            stck = temp;
            stck[++tos] = item;
        } else stck[++tos] = item;

    }

    @Override
    public int pop() {
        if (tos < 0) {
            System.out.println("—тек не загружен");
            return 0;
        } else return stck[tos--];
    }
}
