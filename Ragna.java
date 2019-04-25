import java.io.*;
import java.util.*;

public class Ragna {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        Player novice;
        novice = new Novice();
        Monster monster = new Monster();

        while (true) {
            System.out.println("");
            novice.showAllStatus();
            System.out.println("*****************************************");
            System.out.println("1. Monster List");
            System.out.println("2. Bag");
            System.out.println("0. Exit");
            System.out.println("*****************************************");
            int choose = scanner.nextInt();
            if (choose == 0) {
                break;
            } else if (choose == 2) {
                System.out.println("*****************************************");
                System.out.println("My Bag");
                System.out.println("*****************************************");
                novice.bag.showitem();
                System.out.println("0. Exit");
                System.out.println("*****************************************");
                int selectItem = scanner.nextInt();
                if (selectItem > 0 && selectItem <= novice.bag.getCountBag()) {
                    novice.usepotion(selectItem);
                }
            } 
            else if(choose == 1){
                System.out.println("*****************************************");
                System.out.println("Select Monster");
                System.out.println("*****************************************");
                System.out.println("1. Slime");
                System.out.println("2. Baphomet");
                System.out.println("3. FaceMeKak");
                System.out.println("4. Test Class Job");
                System.out.println("*****************************************");
                int monsterChoose = scanner.nextInt();
                monster.selectmonster(monsterChoose);
                while (monster.getHpMonster() > 0) {
                    System.out.println("*****************************************");
                    System.out.println("Monster");
                    System.out.println(monster.getNameMonster());
                    System.out.println("HP : " + monster.getHpMonster() + "/" + monster.getMaxHp());
                    System.out.println("*****************************************");
                    System.out.println("Your HP : " + novice.gethp() + "/" + novice.getmaxHp());
                    System.out.println("*****************************************");
                    System.out.println("1.Attack DMG "+novice.getDmg());
                    System.out.println("2.Skill Attack");
                    System.out.println("3.Bag");
                    System.out.println("4.Run");
                    System.out.println("*****************************************");
                    int selectAttack = scanner.nextInt();
                    if (selectAttack == 1) {
                        System.out.println( +novice.getDmg()+" Dmg to monster");
                        monster.dmgToMonster(novice.getDmg());
                    }
                    else if(selectAttack == 2){
                        System.out.println("*****************************************");
                        System.out.println("Skill");
                        novice.showSkillList();
                        System.out.println("*****************************************");
                        int skillDmg = novice.useSkill(scanner.nextInt());
                        System.out.println( + skillDmg + "Dmg to monster");
                        monster.dmgToMonster(skillDmg);
                    } 
                    else if (selectAttack == 3) {
                        System.out.println("*****************************************");
                        System.out.println("My Bag");
                        novice.bag.showitem();
                        System.out.println("0. Back");
                        System.out.println("*****************************************");
                        int selectItem = scanner.nextInt();
                        if (selectItem > 0 && selectItem <= novice.bag.getCountBag()) {
                            novice.usepotion(selectItem);
                        }
                    }
                    else {
                        break;
                    }

                    if(selectAttack != 3){
                        System.out.println("You Take "+monster.getDmgMonster()+" Dmg");
                        novice.dmgToHp(-monster.getDmgMonster());
                        if (novice.gethp() <= 0) {
                            break;
                        }
                }
                }
                if (novice.gethp() <= 0) {
                    novice.resurrection();
                }
                else if(monster.getHpMonster() <= 0){
                    System.out.println("YOU WIN!!!");
                    novice.expgain(monster.getExpMonster());
                    System.out.println("+EXP : "+monster.getExpMonster());
                    novice.lvlup();
                    int amount=rand.nextInt(2)+1;
                    System.out.println("Item Drop : "+monster.getItem()+" "+amount+" ea");
                    novice.bag.getNewItem(monster.getItem(),amount);
                    }
                    if(novice.getlvl() >= 10 && novice.getJobClass().equals("Novice")){
                        System.out.println("Class Up");
                        System.out.println("*****************************************");
                        System.out.println("Your life, your choice");
                        System.out.println("*****************************************");
                        System.out.println("1. Merchant");
                        System.out.println("2. Magician");
                        int selectclass = scanner.nextInt();
                        if(selectclass == 1){
                            novice = new Merchant(novice);
                        }
                        if(selectclass == 2){
                            novice = new Magician(novice);    
                        }
                    }
                }
            }
        }
    }