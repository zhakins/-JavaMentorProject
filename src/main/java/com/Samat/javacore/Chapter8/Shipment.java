public class Shipment extends BoxWeight2 {
    double cost;

    //clone object
    Shipment(Shipment ob) {
        super(ob);
        cost = ob.cost;
    }

    //����������� ������������ ��� �������� ���� ����������
    Shipment(double w, double h, double d, double m, double c) {
        super(w, h, d, m);
        cost = c;
    }

    //���������� �� ���������
    Shipment() {
        super();
        cost = -1;
    }

    //���������� ��� �������� ����
    Shipment(double len, double m, double c) {
        super(len, m);
        cost = c;
    }
}

class DemoShipment {
    public static void main(String[] args) {
        Shipment shipment1 = new Shipment(10, 20, 15, 10, 3.14);
        Shipment shipment2 = new Shipment(2, 3, 4, 0.76, 1.28);
        double vol;


        vol = shipment1.volume();
        System.out.println("����� shipment1 ������ " + vol);
        System.out.println("��� shipment1 ������ " + shipment1.weight);
        System.out.println("��������� ��������: $" + shipment1.cost);
        System.out.println();

        vol = shipment2.volume();
        System.out.println("����� shipment2 ������ " + vol);
        System.out.println("��� shipment2 ������ " + shipment2.weight);
        System.out.println("��������� ��������: $" + shipment2.cost);
        System.out.println();
    }
}
