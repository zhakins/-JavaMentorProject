public class Box {
    double width;
    double height;
    double depth;

    //Это конструкто по умолчанию класса Box
    Box() {
        System.out.println("Конструивароние объекта Box");
        width = 10;
        height = 10;
        depth = 10;
    }

    //Это конструкто класса Box
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    //рассчитать и вывести объем
    void vol() {

        System.out.println("Объем равен: " + width * height * depth);
    }

    //установить размеры параллелепипеда
    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    //рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }
}
