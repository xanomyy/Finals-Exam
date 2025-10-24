public class Priest extends Character {
    public Priest() {
        super("Priest", 120, 100, 60);
    }

    @Override
    public void primarySkill(Character target) {
        if (mp < 25) {
            System.out.println("Not enough MP 😞!");
            return;
        }
        mp -= 25;
        int damage = (int)(Math.random() * 20 + 10);
        target.hp -= damage;
        System.out.println(name + " uses Smite and deals " + damage + " holy damage 🙏!");
    }

    @Override
    public void secondarySkill(Character target) {
        if (mp < 40) {
            System.out.println("Not enough MP 😞!");
            return;
        }
        mp -= 40;
        int heal = (int)(Math.random() * 40 + 10);
        hp += heal;
        if (hp > maxHp) hp = maxHp;
        System.out.println(name + " casts Prayer of Healing and restores " + heal + " HP!");
    }
}
