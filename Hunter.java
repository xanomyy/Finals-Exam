
public class Hunter extends Character {
    public Hunter() {
        super("Hunter", 110, 40, 100);
    }

    @Override
    public void primarySkill(Character target) {
        if (sp < 30) {
            System.out.println("𝐍𝐨𝐭 𝐞𝐧𝐨𝐮𝐠𝐡 𝐒𝐏 😞!");
            return;
        }
        sp -= 30;
        int damage = (int)(Math.random() * 30 + 15);
        target.hp -= damage;
        System.out.println(name + " uses Aimed Shot and deals " + damage + " 𝐝𝐚𝐦𝐚𝐠𝐞!");
    }

    @Override
    public void secondarySkill(Character target) {
        if (sp < 30) {
            System.out.println("𝐍𝐨𝐭 𝐞𝐧𝐨𝐮𝐠𝐡 𝐒𝐏 😞!");
            return;
        }
        sp -= 30;
        System.out.println(name + " 𝐮𝐬𝐞𝐬 𝐃𝐞𝐟𝐥𝐞𝐜𝐭 𝐚𝐧𝐝 𝐚𝐯𝐨𝐢𝐝𝐬 𝐭𝐡𝐞 𝐧𝐞𝐱𝐭 𝐚𝐭𝐭𝐚𝐜𝐤!");
    }
}
