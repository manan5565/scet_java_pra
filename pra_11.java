
//Write a simple java application that creates a Player class. Inherit CricketPlayer class from Player class. Inherit Batsman & Bowler classes from CricketPlayer class. Assume suitable data and member methods.
import java.util.*;

public class pra_11 {
    public static void main(String[] args) {
        Player p = new Player();
        p.addPlayer(28, "Jasprit Bumrah", "Cricket");
        CricketPlayer c = new CricketPlayer();
        c.addCricketer();
        new Batsman();
        new Bowler();
    }
}

class Player {
    static int age;
    static String name;
    static String category;
    static String type;

    void addPlayer(int a, String n, String c) {
        age = a;
        name = n;
        category = c;
    }

    Scanner s = new Scanner(System.in); // so obj s is available in all it's sub
}

class CricketPlayer extends Player {
    void addCricketer() {
        if (category.equals("Cricket")) {
            System.out.println(name + " is a Cricketer.\nAge is " + age);
            System.out.println("Enter The Player's Catagory(Batsman or Bowler) :");
            type = s.next();
        } else {
            System.out.println("Player is not Cricketer");
        }
    }
}

class Batsman extends CricketPlayer {
    Batsman() {
        if (type.equals("Batsman")) {
            System.out.println(name + " is Batsman!");
        } else {
            System.out.println(name + " is Not Batsman!");
        }
    }
}

class Bowler extends CricketPlayer {
    Bowler() {
        if (type.equals("Bowler")) {
            System.out.println(name + " is Bowler!");
        } else {
            System.out.println(name + " is Not Bowler!");
        }
    }
}