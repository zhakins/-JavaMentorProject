public class RedDemo {
    public static void main(String[] args) {
        BoxWeight weightbox = new BoxWeight(3, 5, 6, 8.37);
        Box3 plainbox = new Box3();

        double vol;

        vol = weightbox.volume();
        System.out.println("Объем mybox1 равено " + vol);
        System.out.println("Вес mybox1 равено " + weightbox.weight);
        System.out.println();

        //присвоить ссылке на объект BoxWeight ссылки на объект Box3
        plainbox = weightbox;
        vol = plainbox.volume();
        System.out.println("Объем plainbox равено " + vol);
        //следующий оператор ошибочен, поскольку член plainbox не определяет weight
        //System.out.println("Вес plainbox равено " + plainbox.weight);

    }
}
