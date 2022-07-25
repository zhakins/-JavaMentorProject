public class Box4 {
    double widht;
    double height;
    double depth;

    //��������������� ���� �������
    Box4(Box4 ob) {
        widht = ob.widht;
        height = ob.height;
        depth = ob.depth;
    }

    //�����������, ������������ ��� �������� ���� ��������
    Box4(double w, double h, double d) {
        widht = w;
        height = h;
        depth = d;
    }

    //
    //�����������, ������������, ����� �� ���� �� �������� �� ������
    Box4() {
        widht = -1;
        height = -1;
        depth = -1;
    }

    //����������� ������������ ��� �������� ����
    Box4(double len) {
        widht = height = depth = len;
    }

    //���������� � ���������� �����
    double volume() {
        return widht * height * depth;
    }
}

class BoxWeight2 extends Box4 {
    double weight;

    //��������������� ���� �������
    BoxWeight2(BoxWeight2 ob) {
        super(ob);
        weight = ob.weight;
    }


    //������������� ���� idth,height,depth c ������� ������ super()
    BoxWeight2(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }

    //���������� �� ���������
    BoxWeight2() {
        super();
        weight = -1;
    }

    //���������� ����������� ��� �������� ����
    BoxWeight2(double len, double m) {
        super(len);
        weight = m;
    }
}

//���� ����� ���������� Box3, ��������� � ���� �������� �����


class DemoBoxWeight2 {
    public static void main(String[] args) {
        BoxWeight2 mybox1 = new BoxWeight2(10, 20, 15, 34.3);
        BoxWeight2 mybox2 = new BoxWeight2(2, 3, 4, 0.076);
        BoxWeight2 mybox3 = new BoxWeight2();// default
        BoxWeight2 mycube = new BoxWeight2(3, 2);
        BoxWeight2 myclone = new BoxWeight2(mybox1);

        double vol;
        vol = mybox1.volume();
        System.out.println("����� mybox1 ������ " + vol);
        System.out.println("��� mybox1 ������ " + mybox1.weight);
        System.out.println();


        vol = mybox2.volume();
        System.out.println("����� mybox2 ������ " + vol);
        System.out.println("��� mybox2 ������ " + mybox2.weight);
        System.out.println();

        vol = mybox3.volume();
        System.out.println("����� mybox3 ������ " + vol);
        System.out.println("��� mybox3 ������ " + mybox3.weight);
        System.out.println();

        vol = mycube.volume();
        System.out.println("����� mycube ������ " + vol);
        System.out.println("��� mycube ������ " + mycube.weight);
        System.out.println();

        vol = myclone.volume();
        System.out.println("����� myclone ������ " + vol);
        System.out.println("��� myclone ������ " + myclone.weight);
        System.out.println();
    }
}
