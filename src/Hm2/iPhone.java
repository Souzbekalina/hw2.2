package Hm2;

public class iPhone extends Phone  implements Printable{
    private String color;

    public iPhone(String name, int memory, String color) {
        super(name, memory);
        this.color = color;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\n Color: " +color;
    }

    @Override
    public void print() {
        System.out.println(getInfo());


    }
}
