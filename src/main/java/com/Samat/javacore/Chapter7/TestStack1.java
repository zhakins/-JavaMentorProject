public class TestStack1 {
    public static void main(String[] args) {
        Stack1 mystack1 = new Stack1();
        Stack1 mystack2 = new Stack1();

        for (int i = 0; i < 10; i++) {
            mystack1.push(i);
        }
        for (int i = 10; i < 20; i++) {
            mystack2.push(i);
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(mystack1.pop() + " ");
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(mystack2.pop() + " ");
        }

        //эти методы не доступны
        //mystack1.tos = -2;
        //mystack1.stack[3] = 100;
    }
}
