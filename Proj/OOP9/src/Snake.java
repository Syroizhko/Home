public class Snake extends Monster {
    public Snake(String name, Integer health, Integer power) {
        super(name, health, power);
    }

    public Snake() {
    }


    @Override
    public Integer useAttackSpell(){
        //Integer a = super.getPower();
        int damage =super.getPower() * 2;
        //a = damage;
        System.out.println("I use spell FU (Snake)");
        return damage;

    }

}
