import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Location3 {
    private String name;

    private Map<Integer, Monster> monsterMap = new HashMap<>();

    private Integer addToMonsterHp = 0;

    private Integer addToCharacterHp = 0;

    private Integer getaddToMonsterPower = 0;

    private Integer getaddToCharacterPower = 0;


    public Location3(String name, Map<Integer, Monster> monsterMap, Integer addToMonsterHp, Integer addToCharacterHp,
                    Integer getaddToMonsterPower, Integer getaddToCharacterPower) {
        this.name = name;
        this.monsterMap = monsterMap;
        this.addToMonsterHp = addToMonsterHp;
        this.addToCharacterHp = addToCharacterHp;
        this.getaddToMonsterPower = getaddToMonsterPower;
        this.getaddToCharacterPower = getaddToCharacterPower;
    }
    public Location3(String name, Map<Integer, Monster> monsterMap) {
        this.name = name;
        this.monsterMap = monsterMap;

    }

    public Location3() {

    }

    public void dange3(Hunter hunter) {
        Scanner in = new Scanner(System.in);

        Set<Integer> integers = this.monsterMap.keySet();
        for (Integer lvl : integers) {
            Monster monster = this.monsterMap.get(lvl);
            while (monster.getHealth() > 0 && hunter.getHealth() > 0) {
                System.out.println("   ");
                System.out.println("Ваш ворог : "+monster.getName());
                System.out.println("Press 1 for fight or 2 for heal or 3 for hunting");
                switch (in.nextInt()) {

                    case 1: {
                        hunter.fight(monster);
                        break;
                    }
                    case 2: {
                        hunter.hill(monster);
                        break;
                    }
                    case 3:{
                        hunter.useSkills(monster);
                        break;
                    }

                }
                //character.fight(monster);
                System.out.print("monster HP: " + monster.getHealth());
                System.out.println("   character HP: " + hunter.getHealth());
            }

        }
    }

}
