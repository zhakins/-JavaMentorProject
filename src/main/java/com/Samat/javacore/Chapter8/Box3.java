public class Box3 {
    double widht;
    double height;
    double depth;

    //конструктор, используемый при указании всех размеров
    Box3(double w, double h, double d) {
        widht = w;
        height = h;
        depth = d;
    }

    //
    //конструктор, используемый, когда ни один из размеров не указан
    Box3() {
        widht = -1;
        height = -1;
        depth = -1;
    }

    //конструктор используемый при создании куба
    Box3(double len) {
        widht = height = depth = len;
    }

    //рассчитать и возвратить объем
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

    //инициализация поля idth,height,depth c помощью метода super()
    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }
}

//Этот класс раширяется Box3, добавляет в него свойства цвета
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
        System.out.println("Объем mybox1 равено " + vol);
        System.out.println("Вес mybox1 равено " + mybox1.weight);
        System.out.println();


        vol = mybox2.volume();
        System.out.println("Объем mybox2 равено " + vol);
        System.out.println("Вес mybox2 равено " + mybox2.weight);
        System.out.println();
    }
}