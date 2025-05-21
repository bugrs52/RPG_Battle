import java.util.Random;

public class Archer extends Character {
    Random rand = new Random();

    public Archer(String name) {
        super(name, 80, 15);
    }

    @Override
    public void attack(Enemy enemy, int distance) {
        int shotCount = rand.nextInt(100) < 20 ? 2 : 1;
        for (int i = 0; i < shotCount; i++) {
            int damage = baseAttack + distance; // mesafe arttıkça +dmg
            System.out.println(name + " yayla " + damage + " hasar verdi!");
            enemy.takeDamage(damage);
        }
    }
}
