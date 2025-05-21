import java.util.Random;

public class Warrior extends Character {
    Random rand = new Random();

    public Warrior(String name) {
        super(name, 120, 10);
    }

    @Override
    public void attack(Enemy enemy, int distance) {
        int evade = rand.nextInt(100);
        if (evade < 20) {
            System.out.println(name + " düşmanın saldırısından kaçındı!");
            return;
        }

        int damage = baseAttack + Math.max(0, 10 - distance); // mesafe azsa +dmg
        System.out.println(name + " kılıcıyla " + damage + " hasar verdi!");
        enemy.takeDamage(damage);
    }
}
