package Hm2;

public class Main {
    public static void main(String[] args) {
        iPhone iPhone = new iPhone("iPhone", 128, "RED");
        System.out.println(iPhone.getInfo());
        MI mi = new MI("Mi", 32, "Pink");
        System.out.println(mi.getInfo());
        Sumsung sumsung = new Sumsung("sumsung", 64, "Poni");
        System.out.println(sumsung.getInfo());


    }
    //Агай мен ушул жерин билбей жатам.
  /*  public static String  createObject(String classname){
       String phone=classname;
        switch (phone){
            case
                break;
            System.out.println();
            default:

        }


   */
}