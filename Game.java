import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Priest player = new Priest();
        Hunter enemy = new Hunter();

        System.out.println("=== 𝕿𝖊𝖝𝖙-𝕭𝖆𝖘𝖊𝖉 𝕱𝖎𝖌𝖍𝖙𝖎𝖓𝖌 𝕲𝖆𝖒𝖊 ===");
        System.out.println("𝐘𝐨𝐮 𝐚𝐫𝐞 𝐚 𝐏𝐫𝐢𝐞𝐬𝐭. 𝐘𝐨𝐮𝐫 𝐞𝐧𝐞𝐦𝐲 𝐢𝐬 𝐚 𝐇𝐮𝐧𝐭𝐞𝐫.");

        while (player.isAlive()) {
            System.out.println("\n----- 𝐘𝐨𝐮𝐫 𝐓𝐮𝐫𝐧 -----");
            player.showStats();
            enemy.showStats();

            System.out.println("\nChoose action:");
            System.out.println("1. Attack");
            System.out.println("2. Defend");
            System.out.println("3. Use Item");
            System.out.println("4. Smite (Skill 1)");
            System.out.println("5. Prayer of Healing (Skill 2)");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> player.attack(enemy);
                case 2 -> player.defend();
                case 3 -> player.useItem();
                case 4 -> player.primarySkill(enemy);
                case 5 -> player.secondarySkill(enemy);
                default -> System.out.println("𝐈𝐧𝐯𝐚𝐥𝐢𝐝 𝐜𝐡𝐨𝐢𝐜𝐞!");
            }

            if (!enemy.isAlive()) {
                System.out.println("𝐘𝐨𝐮 𝐝𝐞𝐟𝐞𝐚𝐭𝐞𝐝 𝐭𝐡𝐞 𝐇𝐮𝐧𝐭𝐞𝐫 🎉!");
                int potionDrop = (int)(Math.random() * 2);
                if (potionDrop == 0) player.healPotions++;
                else player.manaPotions++;
                System.out.println("𝐘𝐨𝐮 𝐠𝐚𝐢𝐧𝐞𝐝 𝐚 𝐫𝐚𝐧𝐝𝐨𝐦 𝐩𝐨𝐭𝐢𝐨𝐧 🎉!");
                enemy = new Hunter(); // new enemy appears
                continue;
            }

            // Enemy’s turn
            System.out.println("\n----- 𝐄𝐧𝐞𝐦𝐲 𝐓𝐮𝐫𝐧 -----");
            int action = (int)(Math.random() * 3);
            if (action == 0) enemy.attack(player);
            else if (action == 1) enemy.primarySkill(player);
            else enemy.secondarySkill(player);

            if (!player.isAlive()) {
                System.out.println("\n𝙔𝙤𝙪 𝙝𝙖𝙫𝙚 𝙗𝙚𝙚𝙣 𝙙𝙚𝙛𝙚𝙖𝙩𝙚𝙙. 𝙂𝙖𝙢𝙚 𝙊𝙫𝙚𝙧 😢!");
                break;
            }
        }
        sc.close();
    }
}

