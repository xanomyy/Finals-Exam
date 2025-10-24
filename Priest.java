public class Priest extends Character {
    public Priest() {
        super("Priest", 120, 100, 60);
    }

    @Override
    public void primarySkill(Character target) {
        if (mp < 25) {
            System.out.println("𝐍𝐨𝐭 𝐞𝐧𝐨𝐮𝐠𝐡 𝐌𝐏 😞!");
            return;
        }
        mp -= 25;
        int damage = (int)(Math.random() * 20 + 10);
        target.hp -= damage;
        System.out.println(name + " uses Smite and deals " + damage + " 𝐡𝐨𝐥𝐲 𝐝𝐚𝐦𝐚𝐠𝐞 🙏!");
    }

    @Override
    public void secondarySkill(Character target) {
        if (mp < 40) {
            System.out.println("𝐍𝐨𝐭 𝐞𝐧𝐨𝐮𝐠𝐡 𝐌𝐏 😞!");
            return;
        }
        mp -= 40;
        int heal = (int)(Math.random() * 40 + 10);
        hp += heal;
        if (hp > maxHp) hp = maxHp;
        System.out.println(name + " 𝐜𝐚𝐬𝐭𝐬 𝐏𝐫𝐚𝐲𝐞𝐫 𝐨𝐟 𝐇𝐞𝐚𝐥𝐢𝐧𝐠 𝐚𝐧𝐝 𝐫𝐞𝐬𝐭𝐨𝐫𝐞𝐬 " + heal + " HP!");
    }
}
