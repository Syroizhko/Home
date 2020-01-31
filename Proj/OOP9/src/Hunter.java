public class Hunter extends Character {

    public Hunter(String name, Integer health, Integer power) {
        super(name, health, power);
    }

    public Hunter() {
    }


    @Override
    public Integer useSkills(Monster monster) {

        //Integer a;
        //a=getPower()+10;
        System.out.println("Skill use");
        this.health -= monster.getPower();
        Integer monsterHealth = monster.getHealth();
        monsterHealth -= this.power+10;
        monster.setHealth(monsterHealth);
        //return a;
        return monsterHealth;
    }
}
