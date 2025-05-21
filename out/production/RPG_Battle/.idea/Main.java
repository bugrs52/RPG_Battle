import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Character player;

        System.out.println("Karakterini seç:\n1- Savaşçı\n2- Okçu");
        String secim = scanner.nextLine();

        System.out.print("İsmini gir: ");
        String name = scanner.nextLine();

        if (secim.equals("1")) {
            player = new Warrior(name);
        } else {
            player = new Archer(name);
        }

        Enemy enemy = new Enemy("Kara Ork", 100, 15);
        int distance = new Random().nextInt(11); // 0-10 arası
        System.out.println("\nSavaş başladı! Mesafe: " + distance);

        while (player.isAlive() && enemy.isAlive()) {
            System.out.println("\n" + player.name + ": " + player.health + " HP");
            System.out.println(enemy.name + ": " + enemy.health + " HP");

            player.attack(enemy, distance);

            if (enemy.isAlive()) {
                enemy.attack(player);
            }
        }

        if (player.isAlive()) {
            System.out.println("\nTebrikler! " + enemy.name + " yenildi.");
        } else {
            System.out.println("\nKaybettin! " + enemy.name + " seni yendi.");
        }
    }
}
