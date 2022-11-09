package Hm2;

public class Sumsung extends Phone implements Printable{
    private String trinket;

    public Sumsung(String name, int memory, String trinket) {
        super(name, memory);
        this.trinket = trinket;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\n Trinket: " +trinket;
    }

    @Override
    public void print() {
        System.out.println(getInfo());


    }
}
