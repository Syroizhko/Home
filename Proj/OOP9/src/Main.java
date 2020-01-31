
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) throws IOException {
        System.out.println( "   ______________________________________ ");
        System.out.println( " ||--------------------------------------||");
        System.out.println( " ||    _____       _____      _______    ||");
        System.out.println( " ||   |     |     |     |    |           ||");
        System.out.println( " ||   |     |     |     |    |           ||");
        System.out.println( " ||   |_____|     |_____|    |   ____    ||");
        System.out.println( " ||   ||_         |          |       |   ||");
        System.out.println( " ||   |  |_       |          |       |   ||");
        System.out.println( " ||   |    |_     |          |_______|   ||");
        System.out.println( " ||                                      ||");
        System.out.println( " ||______________________________________||");
        System.out.println( "   --------------------------------------  ");







            Scanner in = new Scanner(System.in);


            System.out.println("Введіть ваше імя ");
            Writer writer=new FileWriter("src/Name.txt");
            writer.write(in.next());
            writer.flush();
            writer.close();



            do {
                Menu();




                switch (in.nextInt()) {
                    case 1:{

                        System.out.println("------------------------------------------------");
                        System.out.println("                    1 round                     ");
                        System.out.println("------------------------------------------------");

                        Character character = new Character("test", 100, 16);
                        Monster spider = new Spider("spider", 50, 2);
                        Snake snake = new Snake("snake", 30, 5);
                        Wampir wampir = new Wampir("wampir", 40, 8);
                        Monster boss = new Spider("boss", 50, 12);

                        Map<Integer, Monster> locationMonster = new HashMap<>();
                        locationMonster.put(1, spider);
                        locationMonster.put(2, snake);
                        locationMonster.put(3, wampir);
                        locationMonster.put(4, boss);

                        Location spiderForest = new Location("spider forest", locationMonster);
                        spiderForest.dange(character);

                        System.out.println("------------------------------------------------");
                        System.out.println("                    2 round                     ");
                        System.out.println("------------------------------------------------");

                        Character11 character11 = new Character11("test1", 100, 16);
                        Monster spider1 = new Spider("spider", 50, 2);
                        Snake snake1 = new Snake("snake", 30, 5);
                        Wampir wampir1 = new Wampir("wampir", 40, 8);
                        Monster boss1 = new Spider("boss", 50, 12);

                        Map<Integer, Monster> locationMonster1 = new HashMap<>();
                        locationMonster1.put(1, spider1);
                        locationMonster1.put(2, snake1);
                        locationMonster1.put(3, wampir1);
                        locationMonster1.put(4, boss1);

                        Location spiderForest1 = new Location("spider forest", locationMonster1);
                        spiderForest1.dange(character11);

                        System.out.println("------------------------------------------------");
                        System.out.println("                    3 round                     ");
                        System.out.println("------------------------------------------------");

                        Character character2 = new Character("test2", 100, 16);
                        Monster spider2 = new Spider("spider", 50, 2);
                        Snake snake2 = new Snake("snake", 30, 5);
                        Wampir wampir2 = new Wampir("wampir", 40, 8);
                        Monster boss2 = new Spider("boss", 50, 12);

                        Map<Integer, Monster> locationMonster2 = new HashMap<>();
                        locationMonster2.put(1, spider2);
                        locationMonster2.put(2, snake2);
                        locationMonster2.put(3, wampir2);
                        locationMonster2.put(4, boss2);

                        Location spiderForest2 = new Location("spider forest", locationMonster2);
                        spiderForest2.dange(character2);
                        break;
                    }
                    case 2: {
                        magus magus = new magus("magus", 100, 12, 10);
                        Monster spider = new Spider("spider", 20, 2);
                        Snake snake = new Snake("snake", 30, 4);
                        Wampir wampir = new Wampir("wampir", 40, 8);
                        Monster boss = new Spider("boss", 50, 12);

                        Map<Integer, Monster> locationMonster = new HashMap<>();
                        locationMonster.put(1, spider);
                        locationMonster.put(2, snake);
                        locationMonster.put(3, wampir);
                        locationMonster.put(4, boss);

                        Location2 magusForest = new Location2("magusForest", locationMonster);
                        magusForest.dange2(magus);

                        System.out.println("------------------------------------------------");
                        System.out.println("                    2 round                     ");
                        System.out.println("------------------------------------------------");

                        magus magus1 = new magus("magus", 100, 12, 10);
                        Monster spider1 = new Spider("spider", 20, 2);
                        Snake snake1 = new Snake("snake", 30, 4);
                        Wampir wampir1 = new Wampir("wampir", 40, 8);
                        Monster boss1 = new Spider("boss", 50, 12);

                        Map<Integer, Monster> locationMonster1 = new HashMap<>();
                        locationMonster1.put(1, spider1);
                        locationMonster1.put(2, snake1);
                        locationMonster1.put(3, wampir1);
                        locationMonster1.put(4, boss1);

                        Location2 magusForest1 = new Location2("magusForest", locationMonster1);
                        magusForest1.dange2(magus1);

                        System.out.println("------------------------------------------------");
                        System.out.println("                    3 round                     ");
                        System.out.println("------------------------------------------------");

                        magus magus2 = new magus("magus", 100, 12, 10);
                        Monster spider2 = new Spider("spider", 20, 2);
                        Snake snake2 = new Snake("snake", 30, 4);
                        Wampir wampir2 = new Wampir("wampir", 40, 8);
                        Monster boss2 = new Spider("boss", 50, 12);

                        Map<Integer, Monster> locationMonster2 = new HashMap<>();
                        locationMonster2.put(1, spider2);
                        locationMonster2.put(2, snake2);
                        locationMonster2.put(3, wampir2);
                        locationMonster2.put(4, boss2);

                        Location2 magusForest2 = new Location2("magusForest", locationMonster2);
                        magusForest2.dange2(magus2);

                        break;

                    }
                    case 3: {
                        Hunter hunter = new Hunter("hunter", 100, 10);
                        Monster spider = new Spider("spider", 20, 2);
                        Snake snake = new Snake("snake", 30, 4);
                        Wampir wampir = new Wampir("wampir", 40, 8);
                        Monster boss = new Spider("boss", 50, 12);

                        Map<Integer, Monster> locationMonster = new HashMap<>();
                        locationMonster.put(1, spider);
                        locationMonster.put(2, snake);
                        locationMonster.put(3, wampir);
                        locationMonster.put(4, boss);

                        Location3 hunterForest = new Location3("hunterForest", locationMonster);
                        hunterForest.dange3(hunter);

                        System.out.println("------------------------------------------------");
                        System.out.println("                    2 round                     ");
                        System.out.println("------------------------------------------------");

                        Hunter hunter1 = new Hunter("hunter", 100, 10);
                        Monster spider1 = new Spider("spider", 20, 2);
                        Snake snake1 = new Snake("snake", 30, 4);
                        Wampir wampir1 = new Wampir("wampir", 40, 8);
                        Monster boss1 = new Spider("boss", 50, 12);

                        Map<Integer, Monster> locationMonster1 = new HashMap<>();
                        locationMonster1.put(1, spider1);
                        locationMonster1.put(2, snake1);
                        locationMonster1.put(3, wampir1);
                        locationMonster1.put(4, boss1);

                        Location3 hunterForest1 = new Location3("hunterForest", locationMonster1);
                        hunterForest1.dange3(hunter1);

                        System.out.println("------------------------------------------------");
                        System.out.println("                    3 round                     ");
                        System.out.println("------------------------------------------------");

                        Hunter hunter2 = new Hunter("hunter", 100, 10);
                        Monster spider2 = new Spider("spider", 20, 2);
                        Snake snake2 = new Snake("snake", 30, 4);
                        Wampir wampir2 = new Wampir("wampir", 40, 8);
                        Monster boss2 = new Spider("boss", 50, 12);

                        Map<Integer, Monster> locationMonster2 = new HashMap<>();
                        locationMonster2.put(1, spider2);
                        locationMonster2.put(2, snake2);
                        locationMonster2.put(3, wampir2);
                        locationMonster2.put(4, boss2);

                        Location3 hunterForest2 = new Location3("hunterForest",locationMonster2);
                        hunterForest2.dange3(hunter2);
                        break;

                    }case 4:{
                        Item character=new Item(200,200,200);
                        character.arm1(character);
                        System.out.println(character.health);
                        continue;
                    }
                }
            }while (in.nextInt()!=5);








        }

    public static void Menu(){
        System.out.println("Виберіть персонажа");
        System.out.println("1.Character");
        System.out.println("2.Magus");
        System.out.println("3.Hunter");
        System.out.println("4.End game");

    }






}
