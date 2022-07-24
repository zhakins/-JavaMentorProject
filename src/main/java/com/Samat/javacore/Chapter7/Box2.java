public class Box2 {
    double widht;
    double height;
    double depth;

    //�����������, ������������ ��� �������� ���� ��������
    Box2(double w, double h, double d) {
        widht = w;
        height = h;
        depth = d;
    }

    //
    //�����������, ������������, ����� �� ���� �� �������� �� ������
    Box2() {
        widht = -1;
        height = -1;
        depth = -1;
    }

    //����������� ������������ ��� �������� ����
    Box2(double len) {
        widht = height = depth = len;
    }

    Box2(Box2 o) {
        widht = o.widht;
        height = o.height;
        depth = o.depth;
    }

    //���������� � ���������� �����
    double volume() {
        return widht * height * depth;
    }
}
