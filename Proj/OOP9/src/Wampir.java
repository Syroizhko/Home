public class Wampir extends Monster {
    public Wampir(String name, Integer health, Integer power) {
        super(name, health, power);
    }

    public Wampir() {
    }

    @Override
    public Integer useAttackSpell(){

        int a =super.getPower()*2;
        System.out.println("three monster");
        int health = getHealth();
        health += a;
        setHealth(health);
        return a;



    }
}
