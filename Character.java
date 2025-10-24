
public abstract class Character {
    protected String name;
    protected int hp, mp, sp;
    protected int maxHp, maxMp, maxSp;
    protected int healPotions = 1;
    protected int manaPotions = 1;

    public Character(String name, int hp, int mp, int sp) {
        this.name = name;
        this.hp = this.maxHp = hp;
        this.mp = this.maxMp = mp;
        this.sp = this.maxSp = sp;
    }

    public boolean isAlive() {
        return hp > 0;
    }

    public void attack(Character target) {
        if (sp < 2) {
            System.out.println(name + " 𝐚𝐰𝐰, 𝐲𝐨𝐮 𝐝𝐨𝐧'𝐭 𝐡𝐚𝐯𝐞 𝐞𝐧𝐨𝐮𝐠𝐡 𝐒𝐏 😞!");
            return;
        }
        int damage = (int)(Math.random() * 15 + 5);
        target.hp -= damage;
        sp -= 2;
        System.out.println(name + " 𝐚𝐭𝐭𝐚𝐜𝐤𝐬 𝐚𝐧𝐝 𝐝𝐞𝐚𝐥𝐬 " + damage + " 𝐝𝐚𝐦𝐚𝐠𝐞!");
    }

    public void defend() {
        if (sp < 3) {
            System.out.println(name + " 𝐚𝐰𝐰, 𝐲𝐨𝐮 𝐝𝐨𝐧'𝐭 𝐡𝐚𝐯𝐞 𝐞𝐧𝐨𝐮𝐠𝐡 𝐒𝐏 😞!");
            return;
        }
        sp -= 3;
        System.out.println(name + " 𝐝𝐞𝐟𝐞𝐧𝐝𝐬 𝐚𝐧𝐝 𝐭𝐚𝐤𝐞𝐬 𝐥𝐞𝐬𝐬 𝐝𝐚𝐦𝐚𝐠𝐞 𝐧𝐞𝐱𝐭 𝐭𝐮𝐫𝐧!");
    }

    public void useItem() {
        if (healPotions > 0) {
            healPotions--;
            hp += 40;
            if (hp > maxHp) hp = maxHp;
            System.out.println(name + " 𝐮𝐬𝐞𝐬 𝐚 𝐡𝐞𝐚𝐥𝐢𝐧𝐠 𝐩𝐨𝐭𝐢𝐨𝐧! 𝐇𝐏 𝐫𝐞𝐬𝐭𝐨𝐫𝐞𝐝.");
        } else {
            System.out.println("𝐍𝐨 𝐩𝐨𝐭𝐢𝐨𝐧𝐬 𝐥𝐞𝐟𝐭 😞!");
        }
    }

    public abstract void primarySkill(Character target);
    public abstract void secondarySkill(Character target);

    public void showStats() {
        System.out.println(name + " - HP: " + hp + "/" + maxHp + " | MP: " + mp + "/" + maxMp + " | SP: " + sp + "/" + maxSp);
    }
}
