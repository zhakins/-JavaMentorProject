public class BoxDemo7 {
    public static void main(String[] args) {
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box(3, 6, 9);
        double vol;

        System.out.println("Объем равено: " + mybox1.volume());
        System.out.println("Объем равено: " + mybox2.volume());
    }
}
