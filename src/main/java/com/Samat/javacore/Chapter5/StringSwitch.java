public class StringSwitch {
    public static void main(String[] args) {
        String str = "���";
        switch (str) {
            case "����":
                System.out.println("����");
                break;
            case "���":
                System.out.println("���");
                break;
            case "���":
                break;
            default:
                System.out.println("�� �������");
                break;
        }
    }
}
