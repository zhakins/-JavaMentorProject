public class AskME implements SharedConstants {
    static void answer(int result) {
        switch (result) {
            case NO:
                System.out.println("���");
                break;
            case YES:
                System.out.println("��");
                break;
            case MAYBE:
                System.out.println("��������");
                break;
            case LATER:
                System.out.println("�������");
                break;
            case SOON:
                System.out.println("������");
                break;
            case NEVER:
                System.out.println("�������");
                break;
        }
    }

    public static void main(String[] args) {
        Question q = new Question();
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
    }
}
