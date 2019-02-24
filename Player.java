import java.io.*;
import java.util.*;

public class Player {
    private int hp;
    private int exp;
    private int level;
    private int maxHp;
    private int myDmg;
    private int coin;
    private String name;
    private String jobClass;
    public Bag bag ;
    ArrayList<String> skillList;

    public Player() {
        jobClass = "Novice";
        level = 1;
        maxHp = 50;
        hp = maxHp;
        exp = 0;
        myDmg = 10;
        bag = new Bag();
        skillList = new ArrayList<String>();
    }

    public void setClass(String newClass,int newHp,int newLv,int newDmg,int newCoin,Bag newbag){
        jobClass = newClass;
        maxHp = newHp;
        level = newLv;
        coin = newCoin;
        myDmg = newDmg;
        bag = newbag;
        hp = maxHp;
    }
    
    public String getName(){
        return name;
    }

    public String getJobClass(){
        return jobClass;
    }

    public int getmaxHp(){
        return maxHp;
    }

    public int gethp() {
        return hp;
    }

    public int getexp() {
        return exp;
    }

    public int getlvl() {
        return level;
    }
    public int getDmg(){
        return myDmg;
    }

    public int getCoin(){
        return coin;
    }
    
    public void showAllStatus(){
        System.out.println("Class: " + jobClass);
        System.out.println("Level: " + level);
        System.out.println("HP: " + hp + "/" + maxHp);
        System.out.println("EXP: " + exp + "/" + level*10);
        System.out.println("Coin: " + coin);
    }

    public void expgain(int expIncome) {
        exp = exp + expIncome;
    }

    public void dmgToHp(int dmg) {
        hp = hp + dmg;
        if(hp > maxHp){
            hp = maxHp;
        }
    }

    public void useCoin(int pay){
        coin += pay;
        if(coin < 0){
            coin = 0;
        }
    }

    public void lvlup() {
        while (exp >= level * 10) {
            exp = exp - (level * 10);
            level++;
            maxHp = maxHp + 20;
            hp = maxHp;
            myDmg += level + 1;
            System.out.println("Level Up!!!!!");
        }
    }
    
    public void resurrection() {
        hp = maxHp / 2;
        coin = 0;
        System.out.println("You Die!");
    }

    public void usepotion(int index){
        dmgToHp(bag.getHpFromPotion(index));
        bag.usePotion(index);
    }
    public void showSkillList(){
        int i=0;
        for (String skill : skillList) {
            System.out.println((i+1)+". "+skill);
            i++;
        }
    }
    public int useSkill(int select){
        int skillDmg = 0;
        return skillDmg;
    }
}