package Hm2;

public class MI extends Phone implements Printable{
    private String caseColor;

    public MI(String name, int memory, String caseColor) {
        super(name, memory);
        this.caseColor = caseColor;

    }

    @Override
    public String getInfo() {
        return super.getInfo()+" \nCaseColor: "+ caseColor;
    }

    @Override
    public void  print() {
        System.out.println(getInfo());


    }
}
