import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Location {
    private String name;

    private Map<Integer, Monster> monsterMap = new HashMap<>();

    private Integer addToMonsterHp = 0;

    private Integer addToCharacterHp = 0;

    private Integer getaddToMonsterPower = 0;

    private Integer getaddToCharacterPower = 0;


    public Location(String name, Map<Integer, Monster> monsterMap, Integer addToMonsterHp, Integer addToCharacterHp,
                    Integer getaddToMonsterPower, Integer getaddToCharacterPower) {
        this.name = name;
        this.monsterMap = monsterMap;
        this.addToMonsterHp = addToMonsterHp;
        this.addToCharacterHp = addToCharacterHp;
        this.getaddToMonsterPower = getaddToMonsterPower;
        this.getaddToCharacterPower = getaddToCharacterPower;
    }

    public Location(String name, Map<Integer, Monster> monsterMap) {
        this.name = name;
        this.monsterMap = monsterMap;

    }

    public Location() {

    }

    public void dange(Character character) {
        Scanner in = new Scanner(System.in);

        Set<Integer> integers = this.monsterMap.keySet();
        for (Integer lvl : integers) {
            Monster monster = this.monsterMap.get(lvl);
            while (monster.getHealth() > 0 && character.getHealth() > 0) {
                System.out.println("   ");
                System.out.println("Ваш ворог : " + monster.getName());
                System.out.println("Press 1 for fight or 2 for heal");
                switch (in.nextInt()) {

                    case 1: {
                        character.fight(monster);
                        break;
                    }
                    case 2: {
                        character.hill(monster);
                        break;
                    }

                }
                //character.fight(monster);
                System.out.print("monster HP: " + monster.getHealth());
                System.out.println("   character HP: " + character.getHealth());
            }

        }
    }



        private void addCharacter (Character character){
        }

        private void addToMonster (Monster monster){
            monster.setHealth(monster.getHealth() + addToMonsterHp);
            monster.setPower(monster.getPower() + getaddToMonsterPower);
        }

        private void addTpCharacter (Character character){

            character.setHealth(character.getHealth() + addToMonsterHp);
            character.setPower(character.getPower() + getaddToCharacterPower);
        }

}
