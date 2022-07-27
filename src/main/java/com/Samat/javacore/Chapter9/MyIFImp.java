public class MyIFImp implements MyIF {
    @Override
    public int getNumber() {
        return 100;
    }
}

class DefaultMethodDemo {
    public static void main(String[] args) {
        MyIFImp obj = new MyIFImp();
        System.out.println(obj.getNumber());

        System.out.println(obj.getString());
        int defInt = MyIF.getDefaultNumber();
        System.out.println(defInt);
    }
}