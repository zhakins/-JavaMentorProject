public class StringDemo2 {
    public static void main(String[] args) {
        String strOb1 = "First string";
        String strOb2 = "Second string";
        String strOb3 = strOb1;


        System.out.println("strob.lenth " + strOb1.length());
        System.out.println("Символ по индексу 3 в строке strOb1 равен: " + strOb1.charAt(3));

        if (strOb1 == strOb2) System.out.println("strob1 = strob2");
        else System.out.println("strob1 != strob2");
        if (strOb1 == strOb3) System.out.println("strob1 = strob3");
        else System.out.println("strob1 != strob3");
    }
}
