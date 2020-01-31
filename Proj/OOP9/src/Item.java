import java.util.Scanner;

public class Item extends Character{
    private Integer Helmet;
    private int Armor;
    private int Footwear;

    public Item(String name, Integer health, Integer power, Integer helmet, int armor, int footwear) {
        super(name, health, power);
        Helmet = helmet;
        Armor = armor;
        Footwear = footwear;
    }

    public Item(int helmet, int armor, int footwear) {
        Helmet = helmet;
        Armor = armor;
        Footwear = footwear;
    }

    public int getHelmet() {
        return Helmet;
    }

    public void setHelmet(int helmet) {
        Helmet = helmet;
    }

    public int getArmor() {
        return Armor;
    }

    public void setArmor(int armor) {
        Armor = armor;
    }

    public int getFootwear() {
        return Footwear;
    }

    public void setFootwear(int footwear) {
        Footwear = footwear;
    }
    public void arm2(Character character){
        //this.health=character.health+getHelmet();
        //return health;
        this.health=this.getHelmet()+health;


    }

    public void arm1(Character character){

        character.health=character.health+getHelmet();
        character.setHealth(character.health);
        //character.health=character.getHealth()+getHelmet();
        //character.setHealth(character.health);

    }


    public void Armorr(Character character){
        System.out.println("Vyberit broniu");
        Scanner sc =new Scanner(System.in);

        switch (sc.nextInt()){
            case 1:{
                int chp = character.getHealth() + Helmet;
                character.setHealth(chp);
                break;
            }
        }
        }
    }
//}
