public class Phone {

    @Anot(isTrue=false)
    public String color;
    @Anot(i=2)
    public int Ram;

    public Phone(String color, int ram) {
        this.color = color;
        Ram = ram;
    }

    public void phone(){
        System.out.println("Phone is calling");
    }
}
