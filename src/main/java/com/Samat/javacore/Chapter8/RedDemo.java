public class RedDemo {
    public static void main(String[] args) {
        BoxWeight weightbox = new BoxWeight(3, 5, 6, 8.37);
        Box3 plainbox = new Box3();

        double vol;

        vol = weightbox.volume();
        System.out.println("����� mybox1 ������ " + vol);
        System.out.println("��� mybox1 ������ " + weightbox.weight);
        System.out.println();

        //��������� ������ �� ������ BoxWeight ������ �� ������ Box3
        plainbox = weightbox;
        vol = plainbox.volume();
        System.out.println("����� plainbox ������ " + vol);
        //��������� �������� ��������, ��������� ���� plainbox �� ���������� weight
        //System.out.println("��� plainbox ������ " + plainbox.weight);

    }
}
