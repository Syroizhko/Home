import java.util.Random;

public class Character {

    public String name;
    public Integer health=0;
    public Integer power;

    public Character(String name, Integer health, Integer power) {
        this.name = name;
        this.health = health;
        this.power = power;
    }

    public Character() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public void fight(Monster monster) {

        Random random = new Random();
        int randomInt = random.nextInt(100);
        Integer spellPower = null;
        if (randomInt < 16){
            spellPower = monster.useAttackSpell();
        }
        Integer monsterPower = monster.getPower();
        if (spellPower != null) {
            monsterPower = spellPower;
        }

        this.health -= monsterPower;
        Integer monsterHealth = monster.getHealth();
        monsterHealth -= this.power;
        monster.setHealth(monsterHealth);
    }

    public void hill(Monster monster) {
        this.health += 20;
    }


    public Integer useSkills(Monster monster){
        return null;
    }





}
