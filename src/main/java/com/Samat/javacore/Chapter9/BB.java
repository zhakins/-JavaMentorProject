public interface BB extends AA {
    void meth3();
}

class MyClass implements BB {

    @Override
    public void meth1() {
        System.out.println("���������� ������ meth1().");
    }

    @Override
    public void meth2() {
        System.out.println("���������� ������ meth2().");

    }

    @Override
    public void meth3() {
        System.out.println("���������� ������ meth3().");

    }
}

class IFExtend {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.meth1();
        myClass.meth2();
        myClass.meth3();

    }
}
