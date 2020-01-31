public class magus extends Character {
    private int smite;

    public magus(String name, Integer health, Integer power, int smite) {
        super(name, health, power);
        this.smite = smite;

    }

    public magus(int smite) {
        this.smite = smite;
    }

    //public magus(int smite) {
        //this.smite = smite;
    //}


    public int getSmite() {
        return smite;
    }

    public void setSmite(int smite) {
        this.smite = smite;
    }


    @Override
    public Integer useSkills(Monster monster) {

        //Integer a;
        //a=super.getPower()*2;
        //return a;
        System.out.println("Skill use");
        this.health -= monster.getPower();
        Integer monsterHealth = monster.getHealth();
        monsterHealth -= this.power*2;
        monster.setHealth(monsterHealth);
        return monsterHealth;
    }
}
