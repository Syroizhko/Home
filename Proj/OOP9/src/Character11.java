import java.util.Random;

public class Character11 extends Character {
    public Character11(String name, Integer health, Integer power) {
        super(name, health, power);
    }

    public Character11() {
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
