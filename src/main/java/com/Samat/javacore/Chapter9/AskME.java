public class AskME implements SharedConstants {
    static void answer(int result) {
        switch (result) {
            case NO:
                System.out.println("ÍÅÒ");
                break;
            case YES:
                System.out.println("ÄÀ");
                break;
            case MAYBE:
                System.out.println("ÂÎÇÌÎÆÍÎ");
                break;
            case LATER:
                System.out.println("ÏÎÇÄÍÅÅ");
                break;
            case SOON:
                System.out.println("Âñêîğå");
                break;
            case NEVER:
                System.out.println("ÍÈÊÎÃÄÀ");
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
