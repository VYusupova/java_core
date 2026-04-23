public class Character {
    // Поля класса
    private int maxHealth;      // максимальный уровень здоровья
    private int health;         // текущее здоровье
    private int agility;        // ловкость
    private int strength;       // сила
    private String weapon;       // текущее оружие

    /**
     * Конструктор класса Character.
     * @param maxHealth максимальный уровень здоровья
     * @param agility ловкость
     * @param strength сила
     * @param weapon текущее оружие
     */
    public Character(int maxHealth, int agility, int strength, String weapon) {
        this.maxHealth = maxHealth;
        this.health = maxHealth;  // изначально здоровье равно максимальному
        this.agility = agility;
        this.strength = strength;
        this.weapon = weapon;
    }

    /**
     * Метод для получения урона персонажем.
     * @param damage величина урона
     */
    public void takeDamage(int damage) {
        health = Math.max(0, health - damage);  // здоровье не может быть меньше 0
        System.out.println("Персонаж получил " + damage + " урона. Текущее здоровье: " + health);
    }

    /**
     * Метод для восстановления здоровья.
     * @param amount количество восстанавливаемого здоровья
     */
    public void heal(int amount) {
        health = Math.min(maxHealth, health + amount);  // здоровье не может превышать максимальное
        System.out.println("Персонаж восстановил " + amount + " здоровья. Текущее здоровье: " + health);
    }

    /**
     * Метод для смены оружия.
     * @param newWeapon новое оружие
     */
    public void changeWeapon(String newWeapon) {
        String oldWeapon = this.weapon;
        this.weapon = newWeapon;
        System.out.println("Оружие заменено: " + oldWeapon + " → " + newWeapon);
    }

    /**
     * Метод для вывода статистики персонажа.
     */
    public void showStats() {
        System.out.println("\n--- Статистика персонажа ---");
        System.out.println("Здоровье: " + health + "/" + maxHealth);
        System.out.println("Ловкость: " + agility);
        System.out.println("Сила: " + strength);
        System.out.println("Текущее оружие: " + weapon);
        System.out.println("--------------------------\n");
    }

    // Геттеры (методы для получения значений полей)
    public int getMaxHealth() { return maxHealth; }
    public int getHealth() { return health; }
    public int getAgility() { return agility; }
    public int getStrength() { return strength; }
    public String getWeapon() { return weapon; }

    // Сеттеры (методы для установки значений полей)
    public void setMaxHealth(int maxHealth) { this.maxHealth = maxHealth; }
    public void setHealth(int health) { this.health = health; }
    public void setAgility(int agility) { this.agility = agility; }
    public void setStrength(int strength) { this.strength = strength; }
    public void setWeapon(String weapon) { this.weapon = weapon; }
}

// Пример использования класса
class Main {
    public static void main(String[] args) {
        // Создаём персонажа
        Character hero = new Character(
            100,   // maxHealth
            15,    // agility
            20,    // strength
            "Меч"   // weapon
        );

        // Выводим начальную статистику
        hero.showStats();

        // Персонаж получает урон
        hero.takeDamage(30);

        // Восстанавливаем здоровье
        hero.heal(20);

        // Меняем оружие
        hero.changeWeapon("Лук");

        // Снова выводим статистику
        hero.showStats();
    }
}
