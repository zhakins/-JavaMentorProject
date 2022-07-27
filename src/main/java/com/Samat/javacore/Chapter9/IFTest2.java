public class IFTest2 {
    public static void main(String[] args) {
        DynStack mystack1 = new DynStack(5);
        DynStack mystack2 = new DynStack(8);

        //в этих циклах увеличивается разменры каждого стека
        for (int i = 0; i < 12; i++) mystack1.push(i);
        for (int i = 0; i < 20; i++) mystack2.push(i);


        //извлечь эти числа из стека
        for (int i = 0; i < 12; i++) {
            System.out.println("Стек mystack1: " + mystack1.pop());
        }
        for (int i = 0; i < 20; i++) {
            System.out.println("Стек mystack2: " + mystack2.pop());
        }

    }
}
