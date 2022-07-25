public class Box4 {
    double widht;
    double height;
    double depth;

    //сконструировать клон объекта
    Box4(Box4 ob) {
        widht = ob.widht;
        height = ob.height;
        depth = ob.depth;
    }

    //конструктор, используемый при указании всех размеров
    Box4(double w, double h, double d) {
        widht = w;
        height = h;
        depth = d;
    }

    //
    //конструктор, используемый, когда ни один из размеров не указан
    Box4() {
        widht = -1;
        height = -1;
        depth = -1;
    }

    //конструктор используемый при создании куба
    Box4(double len) {
        widht = height = depth = len;
    }

    //рассчитать и возвратить объем
    double volume() {
        return widht * height * depth;
    }
}

class BoxWeight2 extends Box4 {
    double weight;

    //сконструировать клон объекта
    BoxWeight2(BoxWeight2 ob) {
        super(ob);
        weight = ob.weight;
    }


    //инициализация поля idth,height,depth c помощью метода super()
    BoxWeight2(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }

    //конструкто по умолчанию
    BoxWeight2() {
        super();
        weight = -1;
    }

    //конструкто применяемый при создании куба
    BoxWeight2(double len, double m) {
        super(len);
        weight = m;
    }
}

//Этот класс раширяется Box3, добавляет в него свойства цвета


class DemoBoxWeight2 {
    public static void main(String[] args) {
        BoxWeight2 mybox1 = new BoxWeight2(10, 20, 15, 34.3);
        BoxWeight2 mybox2 = new BoxWeight2(2, 3, 4, 0.076);
        BoxWeight2 mybox3 = new BoxWeight2();// default
        BoxWeight2 mycube = new BoxWeight2(3, 2);
        BoxWeight2 myclone = new BoxWeight2(mybox1);

        double vol;
        vol = mybox1.volume();
        System.out.println("Объем mybox1 равено " + vol);
        System.out.println("Вес mybox1 равено " + mybox1.weight);
        System.out.println();


        vol = mybox2.volume();
        System.out.println("Объем mybox2 равено " + vol);
        System.out.println("Вес mybox2 равено " + mybox2.weight);
        System.out.println();

        vol = mybox3.volume();
        System.out.println("Объем mybox3 равено " + vol);
        System.out.println("Вес mybox3 равено " + mybox3.weight);
        System.out.println();

        vol = mycube.volume();
        System.out.println("Объем mycube равено " + vol);
        System.out.println("Вес mycube равено " + mycube.weight);
        System.out.println();

        vol = myclone.volume();
        System.out.println("Объем myclone равено " + vol);
        System.out.println("Вес myclone равено " + myclone.weight);
        System.out.println();
    }
}
