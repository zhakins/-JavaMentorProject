public interface MyIF {
    int getNumber();

    default String getString() {
        return "������ ���� String �� ���������";
    }

    static int getDefaultNumber() {
        return 0;
    }
}
