public class Box2 {
    double widht;
    double height;
    double depth;

    //конструктор, используемый при указании всех размеров
    Box2(double w, double h, double d) {
        widht = w;
        height = h;
        depth = d;
    }

    //
    //конструктор, используемый, когда ни один из размеров не указан
    Box2() {
        widht = -1;
        height = -1;
        depth = -1;
    }

    //конструктор используемый при создании куба
    Box2(double len) {
        widht = height = depth = len;
    }

    Box2(Box2 o) {
        widht = o.widht;
        height = o.height;
        depth = o.depth;
    }

    //рассчитать и возвратить объем
    double volume() {
        return widht * height * depth;
    }
}
