import java.util.Scanner;

public class BigYear {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.print(">");
            String command = sc.nextLine().toLowerCase();
            if (command.equals("quit"))
                System.exit(0);
            else if (command.equals("add")) {
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Name in Latin: ");
                String latinName = sc.nextLine();
                new Bird(name, latinName);
                System.out.println("New bird " + name + " added!");
            } else if (command.equals("observation")) {
                System.out.println("Enter name of bird: ");
                String name = sc.nextLine();
                int index = findIndex(name);
                if (index != -1)
                    Bird.birdList.get(index).observed();
                else{
                    System.out.println("That's not a bird, dumass");
                }
            } else if (command.equals("all")) {
                printAllInfo();
            } else if (command.equals("one")) {
                Bird.birdList.getFirst().printInfo();
            } else {
                System.out.println("Erronous Input");
            }
        }
    }

    public static int findIndex(String name) {
        for (int i = 0; i < Bird.birdList.size(); i++) {
            if (Bird.birdList.get(i).name.equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public static void printAllInfo() {
        for (Bird bird : Bird.birdList) {
            bird.printInfo();
        }
    }

}

