package Hm2;

public abstract class  Phone implements Printable {
    private String name;
    private int memory;

    public Phone(String name, int memory) {
        this.name = name;
        this.memory=memory;
    }

    public String getName() {
        return name;
    }

    public int getMemory() {
        return memory;
    }
    public String getInfo(){
        return "name: "+name + " \nmemory: " +memory;





    }
}
