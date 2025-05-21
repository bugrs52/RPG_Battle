import java.util.Random;

public class Enemy {
    String name;
    int health;
    int attackPower;
    Random rand = new Random();

    public Enemy(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
        if (this.health < 0) this.health = 0;
    }

    public void attack(Character player) {
        int damage = rand.nextInt(attackPower) + 5;
        System.out.println(name + " " + player.name + "'a " + damage + " hasar verdi!");
        player.takeDamage(damage);
    }
}
