public class Box3 {
    double widht;
    double height;
    double depth;

    //�����������, ������������ ��� �������� ���� ��������
    Box3(double w, double h, double d) {
        widht = w;
        height = h;
        depth = d;
    }

    //
    //�����������, ������������, ����� �� ���� �� �������� �� ������
    Box3() {
        widht = -1;
        height = -1;
        depth = -1;
    }

    //����������� ������������ ��� �������� ����
    Box3(double len) {
        widht = height = depth = len;
    }

    //���������� � ���������� �����
    double volume() {
        return widht * height * depth;
    }
}

class BoxWeight extends Box3 {
    double weight;

    /* BoxWeight(double w, double h, double d, double m) {
         widht = w;
         height = h;
         depth = d;
         weight = m;
     }*/

    //������������� ���� idth,height,depth c ������� ������ super()
    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }
}

//���� ����� ���������� Box3, ��������� � ���� �������� �����
class ColorBox extends Box3 {
    int color;

    ColorBox(double w, double h, double d, int c) {
        widht = w;
        height = h;
        depth = d;
        color = c;
    }
}

class DemoBoxWeight {
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);

        double vol;
        vol = mybox1.volume();
        System.out.println("����� mybox1 ������ " + vol);
        System.out.println("��� mybox1 ������ " + mybox1.weight);
        System.out.println();


        vol = mybox2.volume();
        System.out.println("����� mybox2 ������ " + vol);
        System.out.println("��� mybox2 ������ " + mybox2.weight);
        System.out.println();
    }
}