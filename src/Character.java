public abstract class Character {
    String name;
    int health;
    int baseAttack;

    public Character(String name, int health, int baseAttack) {
        this.name = name;
        this.health = health;
        this.baseAttack = baseAttack;
    }

    public boolean isAlive() {
        return this.health > 0;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
        if (this.health < 0) this.health = 0;
    }

    public abstract void attack(Enemy enemy, int distance);
}
