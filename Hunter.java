
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
        System.out.println(name + " uses Aimed Shot and deals " + damage + " damage!");
    }

    @Override
    public void secondarySkill(Character target) {
        if (sp < 30) {
            System.out.println("Not enough SP 😞!");
            return;
        }
        sp -= 30;
        System.out.println(name + " uses Deflect and avoids the next attack!");
    }
}
