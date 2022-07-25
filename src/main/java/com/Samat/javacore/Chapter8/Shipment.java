public class Shipment extends BoxWeight2 {
    double cost;

    //clone object
    Shipment(Shipment ob) {
        super(ob);
        cost = ob.cost;
    }

    //конструктор используемый при указании всех параметров
    Shipment(double w, double h, double d, double m, double c) {
        super(w, h, d, m);
        cost = c;
    }

    //конструкто по умолчанию
    Shipment() {
        super();
        cost = -1;
    }

    //конструкто при создании куба
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
        System.out.println("Объем shipment1 равено " + vol);
        System.out.println("Вес shipment1 равено " + shipment1.weight);
        System.out.println("Стоимость доставки: $" + shipment1.cost);
        System.out.println();

        vol = shipment2.volume();
        System.out.println("Объем shipment2 равено " + vol);
        System.out.println("Вес shipment2 равено " + shipment2.weight);
        System.out.println("Стоимость доставки: $" + shipment2.cost);
        System.out.println();
    }
}
