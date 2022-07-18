public class Box {
    double width;
    double height;
    double depth;

    //��� ���������� �� ��������� ������ Box
    Box() {
        System.out.println("��������������� ������� Box");
        width = 10;
        height = 10;
        depth = 10;
    }

    //��� ���������� ������ Box
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    //���������� � ������� �����
    void vol() {

        System.out.println("����� �����: " + width * height * depth);
    }

    //���������� ������� ���������������
    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    //���������� � ���������� �����
    double volume() {
        return width * height * depth;
    }
}
