public class A1 {
    int i;
    private int j;

    void setij(int x, int y) {
        i = x;
        j = y;
    }


}

//Член j класса А1 в этом классе не доступен
class B1 extends A1 {
    int total;


    void sum() {
        //  total = i + j; //ОШИБКА: член j в этом классе не доступен
    }

}

class Access {
    public static void main(String[] args) {

        B1 subOb = new B1();
        subOb.setij(10, 20);
        subOb.sum();//
        System.out.println("Сумма равно " + subOb.total);
    }
}