public class Spider extends Monster {

    private Integer mana = 100;

    public Spider(String name, Integer health, Integer power) {
        super(name, health, power);
    }

    public Spider(Integer mana) {
        this.mana = mana;
    }

    @Override
    public Integer useAttackSpell() {

        this.mana -= 26;

        Integer power = super.getPower();
        double damage = power * 1.5;
        power = (int)damage;
        System.out.println("I use spell FU");
        return power;
    }

    public Integer getMana() {
        return mana;
    }

    public void setMana(Integer mana) {
        this.mana = mana;
    }
}
